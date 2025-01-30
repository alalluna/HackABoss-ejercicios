package com.hackaboss.holaMundo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UsuarioRespuesta {
    //para ocultar o mostrar la propiedad que quieras sin exponer datos sensibles de tu estructura
    @JsonProperty("datoRecibido")
    private String parametroRecibido;
    @JsonProperty("datoEnviado")
    private String parametroEnviado;
    @JsonIgnore
    private String status;

    public UsuarioRespuesta() {
    }

    public UsuarioRespuesta(String parametroRecibido, String parametroEnviado, String status) {
        this.parametroRecibido = parametroRecibido;
        this.parametroEnviado = parametroEnviado;
        this.status = status;
    }

    public String getParametroRecibido() {
        return parametroRecibido;
    }

    public void setParametroRecibido(String parametroRecibido) {
        this.parametroRecibido = parametroRecibido;
    }

    public String getParametroEnviado() {
        return parametroEnviado;
    }

    public void setParametroEnviado(String parametroEnviado) {
        this.parametroEnviado = parametroEnviado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UsuarioRespuesta{" +
                "parametroRecibido='" + parametroRecibido + '\'' +
                ", parametroEnviado='" + parametroEnviado + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
