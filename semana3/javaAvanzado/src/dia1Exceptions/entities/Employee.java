package dia1Exceptions.entities;

import dia1Exceptions.exceptions.InvalidSalaryException;

public class Employee {
    private String name;
    private String surname;
    private Integer salary;

    public Employee(String name, String surname, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSalary() {
        return salary;
    }

    //modifico set salary
    public void setSalary(Integer salary) {
    }
    //metodos propios
    public static void addEmployee(String name, String surname, Integer salary)throws InvalidSalaryException {
        if (salary < 0 || salary > 100000) {
            throw new InvalidSalaryException("Salario inválido(debe ser entre 0 y 100,000).");
        }
    }
    //toString

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}


