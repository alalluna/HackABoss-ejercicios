package com.example.entities;
//esta es una entidad intermedia que servira para calcular y mostrar los resultados
//por eso no le pongo el @ porque no se guarda en base de datos
public class ListadoVotos {
    private String candidato;
    private Long votos;

    public ListadoVotos(String candidato, Long votos) {
        this.candidato = candidato;
        this.votos = votos;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public Long getVotos() {
        return votos;
    }

    public void setVotos(Long votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "ListadoVotos{" +
                "candidato='" + candidato + '\'' +
                ", votos=" + votos +
                '}';
    }
}
