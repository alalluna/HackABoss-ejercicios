package Teatro;

public class Mapa {
    public static void dibujarMapa(char[][] asientos){
        //dibujar mapa con un metodo
        for (int f = 0; f < 5; f ++){
            System.out.println( f + " ");

            for (int c = 0; c < 5; c++){
                System.out.println( "[ "+ asientos[f][c] +" ]");
            }
            System.out.println(" ");

        }
    }
}
