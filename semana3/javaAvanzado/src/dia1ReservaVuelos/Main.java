package dia1ReservaVuelos;

import dia1ReservaVuelos.entities.Reservation;
import dia1ReservaVuelos.exceptions.ReserveInvalidException;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Reservation> reservations = new ArrayList<>();
        while(true){
            System.out.println("introduce tu nombre completo o 'salir': ");
            String completeName = scanner.nextLine();
            if(completeName.equalsIgnoreCase("salir")) break;
            System.out.println("introduce un destino: ");
            String destination = scanner.nextLine();

            System.out.println("introduce una fecha(AAAA-MM-DD): ");
            String dateSelected = scanner.nextLine();

            System.out.println("numero de asientos: ");
            String seatsSelected = scanner.nextLine();

            try{
                LocalDate date = LocalDate.parse(dateSelected);
                Integer numberOfSeats = Integer.parseInt(seatsSelected);
                Reservation.bookFlight(completeName, destination, date,numberOfSeats);

                Reservation reservation = new Reservation(completeName,destination,date,numberOfSeats);
                reservations.add(reservation);
                System.out.println("Reserva realizada correctamente");

            }catch (ReserveInvalidException e) {
                System.out.println("Error al introducir una nueva reserva. " + e.getMessage());
            }catch (DateTimeParseException e) {
                    System.out.println("Error: formato de fecha incorrecto. Use el formato AAAA-MM-DD.");
            } catch (NumberFormatException e) {
                    System.out.println("Error: el número de asientos debe ser un número válido.");
            }finally {
                System.out.println("Ha finalizado tu operacion.");
            }

        }
        System.out.println("\n Detalles de las reservas");
        for(Reservation reservation:reservations){
            System.out.println(reservation);
        }
    }
}
