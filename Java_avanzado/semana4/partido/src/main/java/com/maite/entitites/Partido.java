package com.maite.entitites;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Partido {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "equipo_local_id", nullable = false)
    private Equipo equipoLocal;
    @ManyToOne
    @JoinColumn(name = "equipo_foraneo_id", nullable = false)
    private Equipo equipoForaneo;

    private String resultadoFinal;

    //contructor

    public Partido() {
    }

    public Partido(LocalDate fecha, Equipo equipoLocal, Equipo equipoForaneo, String resultadoFinal) {
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoForaneo = equipoForaneo;
        this.resultadoFinal = resultadoFinal;
    }

    public Partido(Long id, LocalDate fecha, Equipo equipoLocal, Equipo equipoForaneo, String resultadoFinal) {
        this.id = id;
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoForaneo = equipoForaneo;
        this.resultadoFinal = resultadoFinal;
    }
    //getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoForaneo() {
        return equipoForaneo;
    }

    public void setEquipoForaneo(Equipo equipoForaneo) {
        this.equipoForaneo = equipoForaneo;
    }

    public String getResultadoFinal() {
        return resultadoFinal;
    }

    public void setResultadoFinal(String resultadoFinal) {
        this.resultadoFinal = resultadoFinal;
    }
    //toString

    @Override
    public String toString() {
        return "Partido{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", EquipoLocal=" + equipoLocal +
                ", EquipoForaneo=" + equipoForaneo +
                ", resultadoFinal='" + resultadoFinal + '\'' +
                '}';
    }
}
