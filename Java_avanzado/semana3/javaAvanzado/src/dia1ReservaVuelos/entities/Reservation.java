package dia1ReservaVuelos.entities;

import dia1ReservaVuelos.exceptions.ReserveInvalidException;

import java.time.LocalDate;

public class Reservation {
    private String completeName;
    private String destination;
    private LocalDate date;
    private Integer numbersOfSeats;

    //contructor


    public Reservation(String completeName, String destination, LocalDate date, Integer numbersOfSeats) {
        this.completeName = completeName;
        this.destination = destination;
        this.date = date;
        this.numbersOfSeats = numbersOfSeats;
    }

    //Getters and setters


    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getNumbersOfSeats() {
        return numbersOfSeats;
    }

    public void setNumbersOfSeats(Integer numbersOfSeats) {
        this.numbersOfSeats = numbersOfSeats;
    }

    //methods

    private static boolean isNumeric(String text) {
        return text.matches("\\d+");
    }

    public static  void bookFlight(String completeName,String destination,LocalDate date,Integer numbersOfSeats)throws ReserveInvalidException {
        if(completeName == null || completeName.isEmpty()){
            throw new ReserveInvalidException("No has introducido un nombre correcto.");
        }
        if(isNumeric(completeName)){
            throw new ReserveInvalidException("El nombre completo no puede ser un numero.");
        }
        if(destination == null || destination.isEmpty()){
            throw new ReserveInvalidException("No has introducido un destino correcto");
        }
        if(isNumeric(destination)){
            throw new ReserveInvalidException("El destino no puede ser un numero.");
        }
        LocalDate fechaActual = LocalDate.now();
        if(fechaActual.isAfter(date)){
            throw new ReserveInvalidException("La fecha de reserva no puede ser anterior a la actual.");
        }
        if(numbersOfSeats < 1 || numbersOfSeats > 100){
            throw new ReserveInvalidException("El numero de asientos no puede ser igual o inferior a 0 ni superior a 100");
        }
    }
    //toString

    @Override
    public String toString() {
        return "Reservation{" +
                "completeName='" + completeName + '\'' +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                ", numbersOfSeats=" + numbersOfSeats +
                '}';
    }
}
