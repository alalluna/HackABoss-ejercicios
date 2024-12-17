package EjercicioPooTwo.Entities;

public class Ave extends Animal{
    public Ave() {
    }

    public Ave(Integer id, String nombre, Integer edad, String tipoDePiel, String tipoDeAlimento) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimento);
    }

    @Override
    public void saludar() {
        super.saludar();
    }
}
