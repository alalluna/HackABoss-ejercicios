package com.example.controllers;

import com.example.entities.Candidato;
import com.example.persistence.GenericoJPA;
import jakarta.persistence.Id;

import java.util.List;

public class CandidatoController {

    private final GenericoJPA<Candidato,Integer> candidatoJPA;
    public CandidatoController(){
        this.candidatoJPA = new GenericoJPA<>(Candidato.class);
    }

    //encotnrar la lista de candidatos
    public List<Candidato> findAll(){
        return candidatoJPA.findAll();
    }
    //crear candidatos no lo utilizo pero me podría servir para añadir otros candidatos

    public void create(String nombre){
      Candidato candidato = new Candidato(nombre);
        candidatoJPA.create(candidato);
    }

}
