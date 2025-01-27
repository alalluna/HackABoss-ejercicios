package com.hackaboss.holaMundo.entities;

public class Dato {
    private long id;
    private String dato;

    public Dato() {
    }

    public Dato(long id, String dato) {
        this.id = id;
        this.dato = dato;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "datoCurioso{" +
                "id=" + id +
                ", dato='" + dato + '\'' +
                '}';
    }
}
