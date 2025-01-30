package com.hackaboss.holaMundo.controllers;

import com.hackaboss.holaMundo.utils.RomanUtils;
import com.hackaboss.holaMundo.models.UsuarioRespuesta;
import org.springframework.web.bind.annotation.*;

@RestController
public class RootController {
    @GetMapping ("/saludar/{nombre}")
    public String saludarConNombre(@PathVariable String nombre){
        return "Hola mundo " + nombre;
    }
    //localhost:8080/saludoConEdad?nombre=Maite&edad=40
    @GetMapping ("/saludoConEdad")
    public String saludarConNombreQS(@RequestParam String nombre,@RequestParam int edad){
        return "hola queryString mi nombre es: "+ nombre+" y tengo " + edad+" años";
    }
    //localhost:8080/saludoConProfesion?nombre=Maite&edad=40&profesion=developer
    @GetMapping ("/saludoConProfesion")
    public String saludarConNombreQS(@RequestParam String nombre,@RequestParam int edad,@RequestParam String profesion){
        return "hola queryString mi nombre es: "+ nombre+", tengo " + edad + " años y soy "+ profesion;
    }

    //localhost:8080/saludarConJSON/maite
    @GetMapping ("/saludarConJSON/{nombre}")
    public UsuarioRespuesta saludarConJSON(@PathVariable String nombre){
        UsuarioRespuesta res = new UsuarioRespuesta();
        res.setParametroRecibido(nombre);
        res.setParametroEnviado("Saludos JSON soy "+ nombre +" y el estado es OK");
        res.setStatus("OK-200");

        System.err.println(res.getStatus());
        return res;
    }
    //localhost:8080/romanConverter/80
    @GetMapping ("/romanConverter/{num}")
    public String convertir(@PathVariable int num){
      return RomanUtils.ValidateNumber(num);
    }



}
