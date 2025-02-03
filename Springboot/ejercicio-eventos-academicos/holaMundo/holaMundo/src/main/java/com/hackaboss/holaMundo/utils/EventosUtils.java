package com.hackaboss.holaMundo.utils;

import com.hackaboss.holaMundo.models.Evento;
import com.hackaboss.holaMundo.models.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EventosUtils {
    private List<Evento> eventos;

    public EventosUtils(){
        this.eventos = new ArrayList<>();
        eventos.add(new Evento(1L, "Inauguración del curso", "Novedades y objetivos del curso 2024-2025",
                LocalDate.of(2024, 9, 10), LocalTime.of(10, 0), "Salón de actos",
                "Juan Pérez", new ArrayList<Usuario>()));
        eventos.add(new Evento(2L, "Fiesta de inauguración", "Celebrar el nuevo curso con comida y bebida",
                LocalDate.of(2024, 9, 15), LocalTime.of(9, 0),
                "Sala Magna", "Lucía Fernández", new ArrayList<Usuario>()));

        eventos.add(new Evento(3L, "Taller de programación", "Aprende Java desde cero",
                LocalDate.of(2025, 4, 15), LocalTime.of(11, 0),
                "Sala de Informática", "Juan Pérez", new ArrayList<Usuario>()));
        eventos.add(new Evento(4L, "Taller de Springboot para APIs", "Ventajas del uso de springbot en apis",
                LocalDate.of(2025, 4, 5), LocalTime.of(9, 0),
                "Sala de Informática", "Juan Pérez", new ArrayList<Usuario>()));

    }
    //para que me muestre los proximos eventos o los eventos desde una fecha concreta
    public List<Evento> findByDate(LocalDate fecha) {
        LocalDate now = LocalDate.now();

        if (fecha == null) {
            return eventos.stream()
                    .filter(evento -> !evento.getFecha().isBefore(now))
                    .collect(Collectors.toList());
        }

        return eventos.stream()
                .filter(evento -> !evento.getFecha().isBefore(fecha))
                .collect(Collectors.toList());
    }
    //para añadir nuevo evento a la lista de eventos por get
  /*  public Evento newEvento(String titulo, String descripcion, LocalDate fecha, LocalTime hora,String lugar,
                            String ponente, List<Usuario> usuarios) {
      Evento nuevoEvento = new Evento(this.eventos.size()+1L,titulo,descripcion, fecha, hora, lugar, ponente,usuarios);
        this.eventos.add(nuevoEvento);
        return nuevoEvento;
    }*/

    public ResponseEntity create(Evento evento) {

        UsuariosUtils usuariosUtils = new UsuariosUtils();
        // Necesito que el ponente exista en la lista de usuarios
        Usuario ponente = usuariosUtils.searchByName(evento.getPonente());
        if (ponente == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: El ponente no es un usuario registrado.");
        }
        //La lista de asistentes puede ser igual o inferior a la lista de usuarios
        List<Usuario> asistentes = evento.getAsistentes().stream()
                .map(usuario -> usuariosUtils.searchByName(usuario.getNombre()))
                .filter(Objects::nonNull) // Filtra los valores nulos (usuarios no encontrados)
                .collect(Collectors.toList());

        evento.setId(this.eventos.size() + 1L);
        evento.setAsistentes(asistentes);
        this.eventos.add(evento);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(evento);

    }
}

