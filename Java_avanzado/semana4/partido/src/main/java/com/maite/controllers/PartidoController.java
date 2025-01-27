package com.maite.controllers;
import  com.maite.entitites.Equipo;
import com.maite.entitites.Partido;
import com.maite.persistence.GenericoJPA;

import java.time.LocalDate;
import java.util.List;

public class PartidoController {
    private GenericoJPA<Partido,Long >partidoJPA;
    private EquipoController equipoController;


    public PartidoController() {
        this.equipoController = new EquipoController();
        this.partidoJPA = new GenericoJPA<>(Partido.class);
    }

    public void registrarPartido(Long idLocal, Long idForaneo, String resultado){
        Equipo local = equipoController.encontrarEquipo(idLocal);
        Equipo foraneo = equipoController.encontrarEquipo(idForaneo);

        if(local !=null && foraneo !=null){
            Partido partido = new Partido();
            partido.setFecha(LocalDate.now());
            partido.setEquipoLocal(local);
            partido.setEquipoForaneo(foraneo);
            partido.setResultadoFinal(resultado);
            partidoJPA.create(partido);
        }else{
            throw new RuntimeException("no se ha podido registrar el partido, verifica que estos equipos existen");
        }
    }
    public List<Partido> listaPartidos(){
        return partidoJPA.findAll();
    }
    public Partido encontrarPartido(Long id){
        return partidoJPA.findOne(id);
    }
    public void eliminarPartido(long id){
        partidoJPA.delete(id);
    }

}
