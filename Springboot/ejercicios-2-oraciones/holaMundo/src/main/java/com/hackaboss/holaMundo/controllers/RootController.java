package com.hackaboss.holaMundo.controllers;

import com.hackaboss.holaMundo.entities.Dato;
import com.hackaboss.holaMundo.entities.Refran;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.hackaboss.holaMundo.utils.GenerateNumberRandom.returnRandomNumber;

@RestController
public class RootController {

    @GetMapping("/datosCuriosos")
    public List<Dato> listarDatos(){
        List<Dato> listado = new ArrayList<>();
        listado.add(new Dato(1, "Los delfines tienen la capacidad de reconocer y recordar estos silbidos específicos incluso después de mucho tiempo"));
        listado.add(new Dato(2, "Las hormigas son capaces de llevar objetos que son hasta 50 veces su propio peso"));
        listado.add(new Dato(3, "Una nube pesa alrededor de un millón de toneladas"));
        listado.add(new Dato(4, "Australia es más ancha que la Luna"));
        listado.add(new Dato(5, "La gente es más creativa en la ducha"));
        listado.add(new Dato(6, "Los dientes humanos son la única parte del cuerpo que no puede curarse por sí misma"));
        listado.add(new Dato(7, "El corazón de las gambas se encuentra en la cabeza"));
        listado.add(new Dato(8, "El unicornio es el animal nacional de Escocia"));
        listado.add(new Dato(9, "Venus es el único planeta que gira en el sentido de las agujas del reloj"));
        listado.add(new Dato(10, "La nuez moscada es un alucinógeno"));
        //
        return listado;
    }
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

    @GetMapping ("/dato")
    public Dato getDatoAleatorio() {
        List<Dato> listado = listarDatos();
        return returnRandomNumber(listado);
    }
    @GetMapping ("/refran")
    public Refran getRefranAleatorio() {
        List<Refran> listado = listarRefranes();
        return returnRandomNumber(listado);
    }
}

