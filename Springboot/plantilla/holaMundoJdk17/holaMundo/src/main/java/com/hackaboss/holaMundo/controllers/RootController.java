package com.hackaboss.holaMundo.controllers;

import com.hackaboss.holaMundo.entities.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//tu clase root debe ser RestController para que puedas empezar a crear rutas
@RestController
public class RootController {
    @GetMapping
    public String otraBienvenida(){
        return "bienvenidos!!;
    }
    @GetMapping(path = "/")
    public String bienvenida(){
        return "mensaje de bienvenida";
    }
    //con getMapping le indicas la ruta que vas a usar y dentro icluyes los metodos
    @GetMapping(path="/saludos")
    public String saludo(){
        return "hola a todos";
    }
    @GetMapping (path ="/usuario")
    public Usuario retornarUsuario(){
        return new Usuario(1, "Maite","albenca");
    }
    @GetMapping(path = "/listaUsuarios")
    public List<Usuario> listaUsuarios(){
        List<Usuario> listado = new ArrayList<>();
        listado.add(new Usuario(2,"Brian", "Gomez"));
        listado.add(new Usuario(3,"Lucia", "Blanco"));
        listado.add(new Usuario(4,"Pablo", "Fernandez"));
        return listado;
    }
}
