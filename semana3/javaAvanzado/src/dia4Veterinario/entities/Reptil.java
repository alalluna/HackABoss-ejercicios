package dia4Veterinario.entities;

//clase hijo Reptil
public class Reptil extends Mascota<String> {
    public Reptil(Integer codigo, String nombre, int edad) {
        super(codigo, nombre, edad, "Reptil");
    }
}
