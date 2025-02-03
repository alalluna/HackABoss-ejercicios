package com.hackaboss.holaMundo.controllers;

import com.hackaboss.holaMundo.models.Evento;
import com.hackaboss.holaMundo.utils.EventosUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventosController {
    //ver eventos próximos,
    // registrar nuevos eventos,
    // inscribir participantes en eventos
    // obtener detalles específicos de un evento.

    // GET /evento/{id}: Obtiene información detallada de un evento específico mediante su ID.


    EventosUtils eventosUtils = new EventosUtils();

    // GET /eventos: Devuelve una lista de todos los eventos académicos próximos.
    //http://localhost:8080/eventos?fecha=2024-1-1
    @GetMapping({"/",""})
    public List<Evento> todosLosEventos(@RequestParam (value = "fecha",required=false) LocalDate fecha) {
        return eventosUtils.findByDate(fecha);
    }

    // POST /evento: Permite a los usuarios crear un nuevo evento académico y almacenarlo en una lista.
    //http://localhost:8080/eventos/nuevo
    @PostMapping("/nuevo")
    public ResponseEntity crearEvento(@RequestBody Evento evento){
        return eventosUtils.create(evento);
    }


}
