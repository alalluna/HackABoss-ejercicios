package com.hackaboss.holaMundo.utils;

import com.hackaboss.holaMundo.models.Rol;
import com.hackaboss.holaMundo.models.Sexo;
import com.hackaboss.holaMundo.models.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsuariosUtils {
    private final List<Usuario> usuarios;

    public UsuariosUtils() {
        this.usuarios =  new ArrayList<>();
        usuarios.add(new Usuario(1L, "Usuario uno", Sexo.SEXO_MASCULINO,
                LocalDate.of(1990, 5, 14), "Ingeniería informática", Rol.ROL_PROFESOR));
        usuarios.add(new Usuario(2L, "Usuario dos", Sexo.SEXO_FEMENINO,
                LocalDate.of(2000, 8, 25), "Ingeniería informática", Rol.ROL_ALUMNO));
        usuarios.add(new Usuario(3L, "Usuario tres", Sexo.SEXO_NO_INCLUIR,
                LocalDate.of(1985, 3, 10), "Ingeniería informática", Rol.ROL_PROFESOR));
        usuarios.add(new Usuario(4L, "Usuario cuatro", Sexo.SEXO_FEMENINO,
                LocalDate.of(2002, 11, 30), "Ingeniería informática", Rol.ROL_ALUMNO));
        usuarios.add(new Usuario(5L, "Usuario cinco", Sexo.SEXO_FEMENINO,
                LocalDate.of(1995, 7, 19), "Diseño", Rol.ROL_INVITADO));
    }

    public List<Usuario> listUsers() {
        return usuarios;
    }

    public ResponseEntity create(Usuario usuario) {

        if (usuario.getNombre() == null || usuario.getNombre().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        usuario.setId(this.usuarios.size()+1L);
        this.usuarios.add(usuario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(usuario);
    }

    public Usuario searchByName(String nombre) {
        return usuarios.stream()
                .filter(usuario -> usuario.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
}