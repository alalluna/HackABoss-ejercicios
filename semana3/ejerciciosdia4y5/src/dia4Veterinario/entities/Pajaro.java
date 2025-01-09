package dia4Veterinario.entities;
//clase hijo Pajaro
public class Pajaro extends Mascota<String>  {
    //defino la especie con el string correspondiente
        public Pajaro(Integer codigo, String nombre, int edad) {
            super(codigo, nombre, edad, "Pajaro");

    }
}
