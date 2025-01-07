package codeaConmigoTurnos;

import codeaConmigoTurnos.entitites.Turno;
import codeaConmigoTurnos.utils.UtilidadesTurno;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import static java.time.LocalDateTime.*;

public class Main {
    public static void main(String[] args) {
        // Crear lista de turnos
        List<Turno> listaTurnos = new ArrayList<>();
        listaTurnos.add(new Turno(1, "Maria Lloguer", "Alergia",
                of(2025, 1, 1, 13, 0),
                of(2025, 1, 1, 14, 0)));
        listaTurnos.add(new Turno(2, "Oliver Moya", "Alergia",
                of(2025, 1, 1, 11, 10),
                of(2025, 1, 1, 12, 0)));
        listaTurnos.add(new Turno(3, "Sandra Perez", "Embarazo",
                of(2025, 1, 1, 10, 0),
                of(2025, 1, 1, 11, 0)));
        listaTurnos.add(new Turno(4, "Maria Lloguer", "Alergia",
                of(2025, 1, 2, 9, 30),
                of(2025, 1, 2, 10, 30)));
        listaTurnos.add(new Turno(5, "Antoni Reis", "Diabetes",
                of(2025, 1, 2, 10, 40),
                of(2025, 1, 2, 11, 30)));
        listaTurnos.add(new Turno(6, "Carlos Soriano", "Diabetes",
                of(2025, 1, 3, 10, 40),
                of(2025, 1, 3, 11, 30)));

        // Filtrar por campo nombre
        Optional<List<Turno>> turnosPorNombre = UtilidadesTurno.filtroPorNombre(listaTurnos, "Maria Lloguer");
        System.out.println("Filtrado por nombrePaciente 'Maria Lloguer':");
        turnosPorNombre.ifPresent(turnos -> turnos.forEach(System.out::println));

        // Filtrar por tipo de paciente
        Optional<List<Turno>> turnosPorTipo = UtilidadesTurno.filtroPorTipoPaciente(listaTurnos, "Diabetes");
        System.out.println("\nFiltrado por tipoPaciente 'Diabetes':");
        turnosPorTipo.ifPresent(turnos ->turnos.forEach(System.out::println));

        // Filtrar por hora de inicio
        LocalDateTime desde = LocalDateTime.of(2025, 1, 1, 10, 0);
        LocalDateTime hasta = LocalDateTime.of(2025, 1, 1, 14, 0);
        //se aplica el metodo
        //se devuelven valores si los hay
        UtilidadesTurno.filtroPorInicio(listaTurnos,desde,hasta)
                .ifPresent(turnos -> turnos.forEach(System.out::println));
        System.out.println("\nFiltro por hora de inicio: " + desde + hasta +":");
        UtilidadesTurno.filtroPorInicio(listaTurnos, of(2025, 1, 1, 10, 0), of(2025, 1, 2, 10, 0)).ifPresent(System.out::println);

        // Filtrar por hora de fin, establecer un valor
        LocalDateTime inicio = of(2025, 1, 3, 11, 30);
        LocalDateTime fin = of(2025, 1, 1, 14, 0);
        //aplicar el metodo
        UtilidadesTurno.filtroPorFin(listaTurnos,inicio,fin)
                .ifPresent(turnos -> turnos.forEach(System.out::println));
        //devolver resultados, si los hay
        System.out.println("\nFiltro por hora final: " + inicio + fin +":");
        UtilidadesTurno.filtroPorFin(listaTurnos, of(2025, 1, 2, 10, 40), of(2025, 1, 3, 10, 0)).ifPresent(System.out::println);
    }
}

