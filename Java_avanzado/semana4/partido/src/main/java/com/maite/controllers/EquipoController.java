package com.maite.controllers;

import com.maite.entitites.Equipo;
import com.maite.persistence.GenericoJPA;

import java.util.List;

public class EquipoController {
    private final GenericoJPA<Equipo, Long> equipoJPA;
    public EquipoController(){
        this.equipoJPA = new GenericoJPA<>(Equipo.class);

    }
    public void generarEquipo(String nombre, String ciudad){
        Equipo equipo = new Equipo();
        equipo.setNombre(nombre);
        equipo.setCiudad(ciudad);
        equipoJPA.create(equipo);

    }

    public Equipo encontrarEquipo(Long id){
        return equipoJPA.findOne(id);
    }

    public List<Equipo> listaEquipos(){
        return equipoJPA.findAll();
    }

    public void eliminarEquipo(Long id){
        equipoJPA.delete(id);
    }
    public void actualizarEquipo(Long id,String nuevoNombre, String nuevaCiudad){
        Equipo equipo =equipoJPA.findOne(id);
        if(equipo !=null){
            equipo.setNombre(nuevoNombre);
            equipo.setCiudad(nuevaCiudad);
        }
    }
}
