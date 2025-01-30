package com.hackaboss.holaMundo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CentimetrosAmetros {
    @JsonIgnore
    private int cm;
    @JsonProperty("respuesta")
    private String result;
    @JsonIgnore
    private String status;

    public CentimetrosAmetros() {
    }

    public CentimetrosAmetros(int cm, String result, String status) {
        this.cm = cm;
        this.result = result;
        this.status = status;
    }

    public int getCm() {
        return cm;
    }

    public void setCm(int cm) {
        this.cm = cm;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CentimetrosAmetros{" +
                "cm=" + cm +
                ", result=" + result+
                ", status='" + status + '\'' +
                '}';
    }
}
