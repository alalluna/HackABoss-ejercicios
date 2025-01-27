package com.maite.controllers;

import com.maite.entities.Persona;
import com.maite.persistence.GenericoJPA;

import java.util.List;

public class PersonaController {

    private final GenericoJPA<Persona, Long> personaJPA;

    public PersonaController() {
        this.personaJPA = new GenericoJPA<>(Persona.class);
    }

    public void create(String nombre, String apellido){
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        personaJPA.create(persona);
    }

    public List<Persona> findAll(){
        return personaJPA.findAll();
    }
}