package com.hackaboss.holaMundo.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RespuestaMenu {
    @JsonProperty("respuesta")
    private String mensaje;
    @JsonProperty("estado")
    private Integer estado;
    @JsonProperty("metodo")
    private String metodo;

    public RespuestaMenu() {
    }

    public RespuestaMenu(String mensaje, Integer estado, String metodo) {
        this.mensaje = mensaje;
        this.estado = estado;
        this.metodo = metodo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "RespuestaMenu{" +
                "mensaje='" + mensaje + '\'' +
                ", estado=" + estado +
                ", metodo='" + metodo + '\'' +
                '}';
    }
}
