import Teatro.Mapa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hola!");
        char[][] asientos = new char[5][5];
        Integer fila, asiento, opcion;
        Boolean continuar = false;

        Scanner sc = new Scanner(System.in);

        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos[0].length; c++) {
                asientos[f][c] = 'O';
            }
        }
        Mapa.dibujarMapa(asientos);

        while (continuar != true) {
            System.out.println("introduce la fila entre 0 y 4");
            fila = sc.nextInt();

            System.out.println("introduce el asiento entre 0 y 4");
            asiento = sc.nextInt();

            if (fila >= 0 && fila <= 4) {
                if (asientos[fila][asiento] == 'O') {
                    asientos[fila][asiento] = 'X';
                    System.out.println("asiento asignado");
                }else{
                    System.out.println("el asiento está ocupado");
                }
            }else{
                System.out.println("Asegurate de introducir un numero válido, existen filas del 0 al 4");
            }
            System.out.println( "Desea continuar? Introduce 1 para seguir u otro número para salir");
            opcion = sc.nextInt();

            if(opcion != 1){
                continuar = true;

            }else{
                System.out.println("Desea ver el mapa de reservas. ingrese 1 si quiere continuar u otro número para salir");
                opcion = sc.nextInt();
                if (opcion == 1){
                    Mapa.dibujarMapa(asientos);
                }
            }
        }
    }
}