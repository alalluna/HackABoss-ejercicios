package com.example.entities;

import jakarta.persistence.*;
//La entidad Estudiante representara a cada una de las personas que ejerce el voto, por lo que tendrá asociada un candidato, el que elija
@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String  apellido;

    @Column
    private String candidato;

    public Estudiante() {
    }

    public Estudiante(Integer id, String nombre, String apellido, String candidato) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.candidato = candidato;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }


    @Override
    public String toString() {
        return "Estudiante {" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", candidato='" + candidato + '\'' +
                '}';
    }

}
