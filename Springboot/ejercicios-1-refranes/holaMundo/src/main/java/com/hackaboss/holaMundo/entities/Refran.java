package com.hackaboss.holaMundo.entities;

public class Refran {
    private long id;
    private String descripcion;

    public Refran(long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Refran() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Refran{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
