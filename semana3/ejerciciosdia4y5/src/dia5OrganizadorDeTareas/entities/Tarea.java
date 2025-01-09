package dia5OrganizadorDeTareas.entities;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    // Constructor
    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    // Métodos para agregar subtareas
    public void introducirSubtarea(Tarea subtarea) {
        this.subtareas.add(subtarea);
    }

    // Para imprimir la jerarquía de tareas
    public void imprimirTareas(int nivel) {
        // Tabulador para representar la jerarquía segun el nivel
        String tabulador = generarTabulador(nivel);
        //imprimir la tarea con el tabulador
        if (nivel == 0) {
            System.out.println(nombre);
        }
        else System.out.println(tabulador + nombre);

        // Recursión para imprimir subtareas, va recorriendo la lista de las subtareas
        for (Tarea subtarea : subtareas) {
            subtarea.imprimirTareas(nivel + 1);
        }
    }

    // Para generar tabulador
    private String generarTabulador(int nivel) {
        //si no hay subniveles, caso base
        if (nivel == 0) {
            return "";
        }
        if (nivel == 1) {
            return "|-- ";
        }
        //si le pongo +1 no funciona porque al recorrerlas los tabuladores van hacia la base
        return "|  "+ generarTabulador(nivel - 1);
    }
}
