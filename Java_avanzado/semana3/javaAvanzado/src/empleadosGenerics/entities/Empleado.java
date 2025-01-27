package empleadosGenerics.entities;
import java.time.LocalDateTime;

public class Empleado {

    private Integer id; // ID único del empleado
    private String nombre; // Nombre del empleado
    private String apellidos; // Apellidos del empleado
    private String cargo; // Cargo o posición
    private Double salario; // Salario del empleado
    private LocalDateTime fechaInicio; // Fecha de inicio en el trabajo

    // Constructor por defecto
    public Empleado() {
    }

    // Constructor con todos los atributos
    public Empleado(Integer id, String nombre, String apellidos, String cargo, Double salario, LocalDateTime fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    // Método toString para mostrar información del empleado
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", fechaInicio=" + fechaInicio +
                '}';
    }
}
