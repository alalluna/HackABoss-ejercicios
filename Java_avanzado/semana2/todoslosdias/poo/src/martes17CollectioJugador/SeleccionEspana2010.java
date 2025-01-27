package martes17CollectioJugador;

import martes17CollectioJugador.Entitites.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class SeleccionEspana2010 {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        //Para primero crear los jugadores
        //jugador casillas = new Jugador ( "Iker Casillas", "portero", 1)...
        //despues los insertariamos
        // jugadores.add(Casillas);


        //crear y agregar jugadores
        jugadores.add(new Jugador("Iker Casillas", "portero",1));
        jugadores.add(new Jugador("Xavi Hernández", "centrocampista",8));
        jugadores.add(new Jugador("Andrés Iniesta", "centrocampista",6));
        jugadores.add(new Jugador("Carles Puyol", "defensa",5));
        jugadores.add(new Jugador("Sergio Ramos", "defensa",15));

        for (Jugador jugador : jugadores) {
            //jugador.atributos();
            System.out.println(jugador.toString());
            //System.out.println(Jugador.toString());
        }
        //scanner para buscar jugador
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número de camiseta para continuar con la busqueda: ");
        int numCamiseta = scanner.nextInt();
        //Boolean encontrado = false;

        for (Jugador jugador : jugadores){
            if(jugador.getCamiseta() == numCamiseta){
                System.out.println(jugador);
                break;
                //encontrado = true;
            }//else{
                //System.out.println("jugador no encontrado");
            //}
        }
    }
}
