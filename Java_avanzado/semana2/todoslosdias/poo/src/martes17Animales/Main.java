package martes17Animales;

import martes17Animales.Entities.Animal;
import martes17Animales.Entities.Ave;
import martes17Animales.Entities.Mamifero;
import martes17Animales.Entities.Reptil;

public class Main {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero (1, "Leon", 5, "pelo", "carnivoro",
                4, "viviparos", "castaño", "sabana");
        Ave ave = new Ave(2,"aguila", 1,"plumas","carnivoro",16.5,
                "circular","pardo","largo y puntiagudo");
        Reptil reptil = new Reptil(3, "cocodrilo", 2, "escamas", "carnivoro",
                5.5, "impermeables","no tiene", "agua y tierra");
        mamifero.saludar();
        ave.saludar();
        reptil.saludar();

        Animal animal ;
        animal = mamifero;
        animal.saludar();


    }
}
