package martes17Animales.Entities;

public class Ave extends Animal{
    private double envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    //Constructores
    public Ave() {
    }

    public Ave(Integer id, String nombre, Integer edad, String tipoDePiel, String tipoDeAlimento, double envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimento);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    //Getters and setters

    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    //Metodo
    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Hola, soy un ave");
    }

    //toString


    @Override
    public String toString() {
        return "Ave{" +
                "envergaduraAlas=" + envergaduraAlas +
                ", tipoVuelo='" + tipoVuelo + '\'' +
                ", colorPlumaje='" + colorPlumaje + '\'' +
                ", tipoPico='" + tipoPico + '\'' +
                '}';
    }
}
