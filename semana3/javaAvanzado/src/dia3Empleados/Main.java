package dia3Empleados;

import dia3Empleados.entities.Employee;

import java.util.*;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //lista de empleados
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Pedro", 10000.00, "Gerente"));
        employees.add(new Employee("Lucia", 7000.00, "Analista"));
        employees.add(new Employee("Lara", 7000.00, "Analista"));
        employees.add(new Employee("Javier", 5000.00, "Desarrollador senior"));
        employees.add(new Employee("Sara", 5000.00, "Desarrollador senior"));
        employees.add(new Employee("Romeo", 2000.00, "Desarrollador junior"));
        employees.add(new Employee("Juan", 2000.00, "Desarrollador junior"));

        //filtrar el numero de empleados que cobran mas de 6000 euros

        double maxSalary = 6000.00;
        long employees6000 = employees.stream()
                .filter( s -> s.getSalary()>maxSalary)
                .count();
        System.out.println(employees6000);

        //filtrar el nombre de los empleados que cobran mas de 6000
        List<String> filterBySalary = employees.stream()
                .filter(j -> j.getSalary()>maxSalary) //filtrar los empleados
                .map(Employee::getName) // Extraer solo los nombres
                .collect(Collectors.toList()); //hacer la lista con los nombres
        System.out.println(filterBySalary);

        //agrupar por categorias y calcular el salario
        List<Employee> orderSalaryByPosition = employees.stream()
                .toList();//crear lista
        // Obtener las categorías
        List<String> positions = orderSalaryByPosition.stream()
                .map(Employee::getPosition)
                .distinct()
                .toList();

        // Calcular el salario promedio recorriendo cada categoría
        for (String position : positions) {
            double averageSalary = orderSalaryByPosition.stream()
                    .filter(emp -> emp.getPosition().equals(position)) // Filtrar por categoría
                    .mapToDouble(Employee::getSalary) // Extraer los salarios de los empleados
                    .average() // Calcular el promedio
                    .orElse(0.0); // Si no hay empleados, el promedio será 0.0

            System.out.println("Categoría: " + position + ", Salario promedio: " + averageSalary);
        }

        //El empleado con el sueldo mas alto
        Optional<Employee> highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        //topEmployee manejara las dos opciones si es nulo o si no mostrara el mas alto con .orElse
        Employee topEmployee = highestPaidEmployee.orElse(null);
        if (topEmployee != null) {
            System.out.println("El empleado con el sueldo mas alto es : "+ topEmployee);
        } else {
            System.out.println("No hay empleados en la lista.");
        }

    }

}
