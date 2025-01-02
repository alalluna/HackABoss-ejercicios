package dia3Empleados.entities;

public class Employee {

        private String name;
        private double salary;
        private String position;

        public Employee(String name, double salary, String position) {
            this.name = name;
            this.salary = salary;
            this.position = position;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", position='" + position + '\'' +
                    '}';
        }
    }

