package com.hackaboss.holaMundo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Usuario {
    @JsonIgnore
    private Long id;
    @JsonProperty("Nombre_completo")
    private String nombre;
    @JsonIgnore
    private Sexo sexo;
    @JsonIgnore
    private LocalDate fechaNacimiento;
    @JsonProperty("Estudios")
    private String estudios;
    //este atributo sera enum para que tanto profesores como estudiantes puedar realizar eventos
    //enum limitara este atributo a dos opciones profesor o estudiante

    @JsonProperty("Tipo_usuario")
    private Rol rol;

    //constructor,getters, setters y
    public Usuario() {
    }

    public Usuario(Long id, String nombre, Sexo sexo, LocalDate fechaNacimiento, String estudios, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.estudios = estudios;
        this.rol = rol;
    }

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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", estudios='" + estudios + '\'' +
                ", rol=" + rol +
                '}';
    }
}
