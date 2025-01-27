package miercoles18Vehiculo;

import miercoles18Vehiculo.entities.Auto;
import miercoles18Vehiculo.entities.Camioneta;
import miercoles18Vehiculo.entities.Moto;
import miercoles18Vehiculo.entities.Vehiculo;
import miercoles18Vehiculo.intefaces.Combustion;
import miercoles18Vehiculo.intefaces.Electrico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Auto automovilElectrico = new Auto(1,"7120-NGG", "Tesla", 2000, "one", 100000.00, 75000, 9,0);
        Auto automovilGasolina = new Auto(2,"5070-FGH", "Renault", 2006, "megane", 1000.00, 0, 0,70000);
        Camioneta camionetaGasoil = new Camioneta(3,"3030-DFS","Dacia", 2010,"Jogger",13000.00, 8000,50,0);
        Camioneta camionetaHibrida = new Camioneta(4,"3030-DFS","Renault", 2019,"Rifter",20000.00, 8000,50,9000);
        Moto motoGasolina = new Moto(5,"0798-HJK", "Vespa",1993,"Vespa", 12000.00,0,90,"Gasolina");
        Moto motoElectrica = new Moto(6,"7834-POI", "Xiami",2020,"City", 19000.00,6000,90,"Electrico");

        vehiculos.add(automovilElectrico);
        vehiculos.add(camionetaGasoil);
        vehiculos.add(automovilGasolina);
        vehiculos.add(camionetaHibrida);
        vehiculos.add(motoGasolina);
        vehiculos.add(motoElectrica);

        for (Vehiculo vehiculo: vehiculos) {
            System.out.println("Antiguedad del vehiculo: " + vehiculo.calcularAntiguedad());

            if (vehiculo instanceof Electrico){
                ((Electrico) vehiculo).cargarEnergia();
            }else if(vehiculo instanceof Combustion){
                ((Combustion) vehiculo).recargarCombustion();
            }else {
                System.err.println("No existe este tipo de automovil");
            }
        }
    }
}