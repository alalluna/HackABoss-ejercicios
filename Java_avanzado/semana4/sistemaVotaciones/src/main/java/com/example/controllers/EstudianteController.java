package com.example.controllers;

import com.example.entities.Estudiante;
import com.example.entities.ListadoVotos;
import com.example.persistence.GenericoJPA;

import java.util.ArrayList;
import java.util.List;

public class EstudianteController {
    private final GenericoJPA<Estudiante, Integer> estudianteJPA;


    public EstudianteController() {
        this.estudianteJPA = new GenericoJPA<>(Estudiante.class);

    }

    // Listar todos los estudiantes
    public List<Estudiante> findAll() {
        return estudianteJPA.findAll();
    }

    // Registrar un estudiante
    public void create(Estudiante estudiante) {
        estudianteJPA.create(estudiante);
    }

    //Para votar enceuntra al estudiante por id, elige candidato, edita la tabla de estudiante
    public void votar(int id, String candidatoNombre) {
        Estudiante estudiante = estudianteJPA.findOne(id);

        if (estudiante != null) {
            estudiante.setCandidato(candidatoNombre);
            estudianteJPA.update(estudiante);
        } else {
            System.err.println("Estudiante no encontrado.");
        }
    }
    //  contar votos usando listas
    public List<ListadoVotos> contarVotos() {
        List<Estudiante> estudiantes = estudianteJPA.findAll();

        // Definir los candidatos
        List<String> candidatos = new ArrayList<>();
        candidatos.add("A");
        candidatos.add("B");
        candidatos.add("C");

        List<ListadoVotos> resultados = new ArrayList<>();

        // Contar votos para cada candidato
        for (String candidato : candidatos) {
            long recuento = estudiantes.stream()
                    .filter(estudiante -> candidato.equalsIgnoreCase(estudiante.getCandidato()))
                    .count();
            resultados.add(new ListadoVotos(candidato, recuento));

        }
        // Verifica el conteo de votos
        System.out.println("Resultados de Votación: ");
        for (ListadoVotos resultado : resultados) {
            System.out.println(resultado.getCandidato() + ": " + resultado.getVotos());
        }
        // Retornar la lista de resultados
        return resultados;
    }

}