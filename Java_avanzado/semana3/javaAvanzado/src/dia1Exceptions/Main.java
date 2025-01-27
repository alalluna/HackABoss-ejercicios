package dia1Exceptions;

import dia1Exceptions.entities.Employee;
import dia1Exceptions.exceptions.InvalidSalaryException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//    ArrayList<Employee> employees = new ArrayList<>();
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese el nombre del empleado o 'salir': ");
            String name = scanner.nextLine();
            if( name.equalsIgnoreCase("salir")) break;

            System.out.print("Ingrese el apellido del empleado o 'salir': ");
            String surname = scanner.nextLine();
            if( surname.equalsIgnoreCase("salir")) break;

            System.out.print("Ingrese el salario del empleado o 'salir': ");
            String salaryInput = scanner.nextLine();
            if( salaryInput.equalsIgnoreCase("salir")) break;

            try {
                Integer salary = Integer.parseInt(salaryInput);
                Employee emp = new Employee(name,surname,salary);
                Employee.addEmployee(name, surname, salary);
                System.out.println("Empleado agregado correctamente.");
                employees.add(emp);
            } catch (InvalidSalaryException e) {
                System.out.println("Error al agregar empleado: " + e.getMessage());
            } finally {
                System.out.println("has introducido con o sin exito este empleado.");
            }

        }

        System.out.println("\nLista de empleados:");
        for (Employee employee: employees){
            System.out.println(employees);
        }
        scanner.close();
    }
}
