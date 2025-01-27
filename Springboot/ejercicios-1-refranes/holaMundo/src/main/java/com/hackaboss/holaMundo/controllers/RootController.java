package com.hackaboss.holaMundo.controllers;

import com.hackaboss.holaMundo.entities.Refran;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@RestController
public class RootController {

    @GetMapping("/refranes")
    public List<Refran> listarRefranes(){
        List<Refran> listado = new ArrayList<>();
        listado.add(new Refran(1, "No hay mal que por bien no venga"));
        listado.add(new Refran(2, "A quien madruga Dios le ayuda"));
        listado.add(new Refran(3, "El que mucho abarca, poco aprieta"));
        listado.add(new Refran(4, "Mas vale tarde que nunca"));
        listado.add(new Refran(5, "A caballo regalado, no se le mira el diente"));
        listado.add(new Refran(6, "Cuando digo digo, digo Diego"));
        listado.add(new Refran(7, "Más vale prevenir que curar."));
        listado.add(new Refran(8, "No es oro todo lo que reluce"));
        listado.add(new Refran(9, "Al mal tiempo buena cara"));
        listado.add(new Refran(10, "Quien tiene un amigo tiene un tesoro"));

        return listado;
    }

    @GetMapping ("/refran")
    public Refran getRefranAleatorio(){
        List<Refran> listado = listarRefranes();
        Random random = new Random();
        int index = random.nextInt(listado.size());
        return listado.get(index);
    }
}
