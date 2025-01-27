package dia4Veterinario.entities;
//clase hijo Gato
public class Gato extends Mascota<String> {
    public Gato(Integer codigo, String nombre, int edad) {
        super(codigo, nombre, edad, "Gato");
    }
}

