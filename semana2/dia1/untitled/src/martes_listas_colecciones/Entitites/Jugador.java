package martes_listas_colecciones.Entitites;

import java.util.ArrayList;

public class Jugador {
 private String nombre;
 private String posicion;
 private int camiseta;

    public Jugador() {
    }

    public Jugador(String nombre, String posicion, int camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.camiseta = camiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }

    public void atributos(){
        System.out.println( "El jugador " + nombre + " juega como " + posicion+ " y lleva el numero de camiseta "+camiseta +".");
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", camiseta=" + camiseta +
                '}';
    }
}
