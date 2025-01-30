package com.hackaboss.holaMundo.controllers;

import com.hackaboss.holaMundo.entitites.Persona;
import com.hackaboss.holaMundo.responses.RespuestaPersona;
import com.hackaboss.holaMundo.utils.PersonaUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//localhost:8080/personas/      - get para traer un listado
//localhost:8080/personas/nuevo?nombre=f&edad=50 - get, aunque deberia ser post
//localhost:8080/personas/5     - get persona 5
//localhost:8080/personas/      - post para traer un usuario
//localhost:8080/personas/nuevo - post para traer un listado

@RestController
@RequestMapping ("/personas")
public class PersonaController {

    PersonaUtils personaUtils = new PersonaUtils();
    @GetMapping({"/", ""})
    public List<Persona> obtenerListaPersonas(){
        return personaUtils.findAll();
    }

    @GetMapping("/nuevo")
    public Persona crearPersona(@RequestParam String nombre, @RequestParam int edad){
//        return "llego la info de "+ nombre + " que tiene "+ edad;
        return personaUtils.newPersona(nombre,edad);
    }
    @GetMapping("/{id}")
    public Persona buscarPersona(@PathVariable Long id){
//        return "llego la info de "+ nombre + " que tiene "+ edad;
        return personaUtils.findOne(id);
    }
    @PostMapping({"/", ""})
    public RespuestaPersona crearPersona(@RequestBody Persona persona){
        return personaUtils.create(persona);
    }

    @PostMapping("/new")
    public ResponseEntity crearPersonaEntity(@RequestBody Persona persona){
        return personaUtils.createResponseEntity(persona);
    }

}
