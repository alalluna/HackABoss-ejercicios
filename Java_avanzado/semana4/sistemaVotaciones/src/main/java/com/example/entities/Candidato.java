package com.example.entities;


import jakarta.persistence.*;
//la entidad Candidato es para elegir el voto, y dispondrá una lista de a b c
@Entity
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    public Candidato() {
    }

    public Candidato(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Candidato(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
