package empleadosGenerics;

import empleadosGenerics.entities.Empleado;
import empleadosGenerics.utils.Crud;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Crud crud = new Crud();

        // Crear empleados
        crud.create(new Empleado(null, "Rodrigo", "Perez", "Desarrollador", 2500.0, LocalDateTime.now()));
        crud.create(new Empleado(null, "Julia", "Lopez", "Analista", 3000.0, LocalDateTime.now()));

        // Leer todos los empleados
        System.out.println("Empleados registrados:");
        crud.findAll().forEach(System.out::println);

        // Buscar un empleado por ID
        System.out.println("\nBuscando empleado con ID 1:");
        crud.findById(1).ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Empleado no encontrado.")
        );

        // Actualizar un empleado
        System.out.println("\nActualizando empleado con ID 1:");
        boolean actualizado = crud.update(1, new Empleado(null, "Rodrigo", "Martinez", "Senior Developer", 3500.0, LocalDateTime.now()));
        System.out.println(actualizado ? "Empleado actualizado." : "Empleado no encontrado.");
        crud.findAll().forEach(System.out::println);

        // Eliminar un empleado
        System.out.println("\nEliminando empleado con ID 2:");
        boolean eliminado = crud.deleteById(2);
        System.out.println(eliminado ? "Empleado eliminado." : "Empleado no encontrado.");
        crud.findAll().forEach(System.out::println);

        // Contar empleados
        System.out.println("\nTotal de empleados registrados: " + crud.totalEmployees());
    }
}
