package empleadosGenerics.utils;

import empleadosGenerics.entities.Empleado;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Crud {
    private final List<Empleado> empleados;
    private int nextId; // Para generar IDs únicos en ausencia de BBDD

    // Constructor
    public Crud() {
        this.empleados = new ArrayList<>();
        this.nextId = 1; // Comienza desde 1
    }

    // Crear un nuevo empleado
    public void create(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo.");
        }
        empleado.setId(nextId++); // Asignar un ID único
        empleados.add(empleado);
    }

    // Leer todos los empleados
    public List<Empleado> findAll() {
        return new ArrayList<>(empleados); // Retornar una copia para evitar modificaciones externas
    }

    // Buscar un empleado por ID
    public Optional<Empleado> findById(int id) {
        return empleados.stream()
                .filter(empleado -> empleado.getId() == id)
                .findFirst();
    }

    // Actualizar un empleado por ID
    public boolean update(int id, Empleado nuevosDatos) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId() == id) {
                nuevosDatos.setId(id); // Mantener el mismo ID
                empleados.set(i, nuevosDatos);
                return true;
            }
        }
        return false; // No se encontró el empleado
    }

    // Eliminar un empleado por ID
    public boolean deleteById(int id) {
        return empleados.removeIf(empleado -> empleado.getId() == id);
    }

    // Contar el total de empleados
    public int totalEmployees() {
        return empleados.size();
    }
}
