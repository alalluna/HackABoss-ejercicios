package com.hackaboss.holaMundo.utils;

import com.hackaboss.holaMundo.entitites.Persona;
import com.hackaboss.holaMundo.responses.RespuestaPersona;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class PersonaUtils {
    private List<Persona> personas;

    public PersonaUtils() {
        this.personas = new ArrayList<>();
        personas.add (new Persona(1,"a",1));
        personas.add (new Persona(2,"b",2));
        personas.add (new Persona(3,"c",3));
        personas.add (new Persona(4,"d",4));
        personas.add (new Persona(5,"e",5));
    }

    public List<Persona> findAll(){
        return this.personas;
    }
    public Persona newPersona(String nombre, int edad){
        Persona nuevaPersona = new Persona(this.personas.size()+1L,nombre,edad);
        this.personas.add(nuevaPersona);
        return nuevaPersona;
    }

    public Persona findOne(Long id) {
        return this.personas.stream()
                .filter(persona -> persona.getId().equals(id))
                .findFirst()
                .get();
    }

    public RespuestaPersona create(Persona persona) {
       try{
           this.personas.add(persona);
           return new RespuestaPersona("Usuario creado con exito",200,"POST -OK");
       }catch (Exception e){
           return new RespuestaPersona(e.getMessage(), 500, "POST- error");
       }
    }

    public ResponseEntity createResponseEntity(Persona persona) {
        HttpHeaders headers =new HttpHeaders();
        headers.add("clavePrioritaria", "valorPrioritario");
        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(persona);
    }
}
