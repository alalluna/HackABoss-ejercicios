package dia3GestorDeEventos;
import dia3Empleados.entities.Employee;
import dia3GestorDeEventos.Entities.Event;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Lista de eventos
        List<Event> events = new ArrayList<>();
        events.add(new Event("Reunión con clientes", LocalDate.of(2025, 1, 5), "Reunión"));
        events.add(new Event("Conferencia de tecnología", LocalDate.of(2025, 1, 6), "Conferencia"));
        events.add(new Event("Taller de Java", LocalDate.of(2025, 1, 5), "Taller"));
        events.add(new Event("Reunión de equipo", LocalDate.of(2025, 1, 7), "Reunión"));



        // Filtrar los eventos que están programados para una fecha específica
        LocalDate specificDate = LocalDate.of(2025, 1, 5);
        List<Event> eventsOnSpecificDate = events.stream()
                .filter(l -> l.getDate().equals(specificDate))
                .toList();

        System.out.println("Eventos programados para " + specificDate + ":");
        //que imprima una linea por cada uno
        eventsOnSpecificDate.forEach(System.out::println);


        // Obtener las categorías distintas
        List<String> categories = events.stream()
                .map(Event::getCategory)    // Obtener la categoría de cada evento
                .distinct()                 // Filtrar las categorías únicas
                .toList();

        // Calcular la cantidad de eventos por categoría
        for (String category : categories) {
            long count = events.stream()
                    .filter(s -> s.getCategory().equals(category))  // Filtrar por categoría
                    .count();  // Contar los eventos de esa categoría

            System.out.println("Categoría: " + category + ", Número de eventos: " + count);
        }

        // Encontrar el evento más próximo en el tiempo
        Optional<Event> nextEvent = events.stream()
                .min(Comparator.comparing(Event::getDate));

        System.out.println("\n");
        // Manejo de la opción nula o evento encontrado
        Event topEvent = nextEvent.orElse(null);
        if (topEvent != null) {
            System.out.println("El evento más próximo es: " + topEvent);
        } else {
            System.out.println("No hay eventos futuros.");
        }
    }
}
