package com.hackaboss.holaMundo.controllers;

import com.hackaboss.holaMundo.models.Usuario;
import com.hackaboss.holaMundo.utils.UsuariosUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    UsuariosUtils usuariosUtils = new UsuariosUtils();
    // GET Permite crear usuarios y almacenarlo en una lista.
    //http://localhost:8080/usuarios
    @GetMapping({"/",""})
    public List<Usuario> usuarios() {
        return usuariosUtils.listUsers();
    }

    // POST Permite crear usuarios y almacenarlo en una lista.
    //http://localhost:8080/usuarios/nuevo
    @PostMapping("/nuevo")
    public ResponseEntity crearUsuario(@RequestBody Usuario usuario){
        return usuariosUtils.create(usuario);
    }
}
