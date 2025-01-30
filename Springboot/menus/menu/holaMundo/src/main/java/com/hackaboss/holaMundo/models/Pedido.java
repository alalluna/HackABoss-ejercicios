package com.hackaboss.holaMundo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    @JsonProperty("num")
    private Long id;
    @JsonProperty("cliente")
    private String cliente;
    @JsonProperty("platos")
    private List<Plato> menu;

    public Pedido() {
        //necesito inicilizar el array para evitar los null
        this.menu = new ArrayList<>();
    }

    public Pedido(Long id, String cliente, List<Plato> menu) {
        this.id = id;
        this.cliente = cliente;
        this.menu = menu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Plato> getMenu() {
        return menu;
    }

    public void setMenu(List<Plato> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", menu=" + menu +
                '}';
    }
}
