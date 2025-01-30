package com.hackaboss.holaMundo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Plato {
    @JsonProperty("codigo")
    private Long id;
    @JsonProperty("tipo_menu")
    private String tipoMenu;
    @JsonProperty("descripcion")
    private String plato;

    public Plato() {
    }

    public Plato(Long id, String tipoMenu, String plato) {
        this.id = id;
        this.tipoMenu = tipoMenu;
        this.plato = plato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", tipoMenu='" + tipoMenu + '\'' +
                ", plato='" + plato + '\'' +
                '}';
    }
}
