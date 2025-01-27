package com.maite.entitites;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Equipo {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Column(nullable = false)
    private String nombre;
@Column(nullable = false)
    private String ciudad;

    @OneToMany(mappedBy = "equipoLocal",cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Partido> partidosLocal;

    @OneToMany(mappedBy = "equipoForaneo",cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Partido> partidosForaneo;
//Constructor

    public Equipo() {
    }

    public Equipo(String nombre, String ciudad, List<Partido> partidos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Equipo(String nombre, String ciudad, Long id) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.id = id;
    }

    public Equipo(Long id, String nombre, String ciudad, List<Partido> partidosLocal, List<Partido> partidosForaneo) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.partidosLocal = partidosLocal;
        this.partidosForaneo = partidosForaneo;
    }
    //getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Partido> getPartidosLocal() {
        return partidosLocal;
    }

    public void setPartidosLocal(List<Partido> partidosLocal) {
        this.partidosLocal = partidosLocal;
    }

    public List<Partido> getPartidosForaneo() {
        return partidosForaneo;
    }

    public void setPartidosForaneo(List<Partido> partidosForaneo) {
        this.partidosForaneo = partidosForaneo;
    }
//tostring


    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", partidosLocal=" + partidosLocal +
                ", partidosForaneo=" + partidosForaneo +
                '}';
    }
}
