package martes17vestimenta.Entities;

public class Zapato extends Vestimenta{
    private String material;
    private String tipoCierre;

    //Contructores
    public Zapato() {
    }

    public Zapato(String codigo, String nombre, double precio, String marca, String talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    //Getters y setters
    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //toString
    @Override
    public String toString() {
        return "Zapato{" +
                "material='" + material + '\'' +
                ", tipoCierre='" + tipoCierre + '\'' +
                '}';
    }
}
