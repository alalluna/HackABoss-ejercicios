package codeaConmigoTurnos.utils;

import codeaConmigoTurnos.entitites.Turno;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UtilidadesTurno {
    //en todos los metodos habrá un optional y un filter
    //la lista debe ser optional por si no existe el nombre del paciente
    public static Optional<List<Turno>> filtroPorNombre(List<Turno> listaTurnos, String nombrePaciente) {
        return Optional.of(listaTurnos.stream()
                //cogemos el nombre e ignoramos mayus y minus
                .filter(turno -> turno.getNombrePaciente().equalsIgnoreCase(nombrePaciente))
                //el to list para devolver el valor o valores que coincidan con este String
                //tb puedo usar .collect(collectors...)
                .toList());
    }
    //tb puede necesitarlo el siguiente filtro porque podría haber un dato null
    public static Optional<List<Turno>> filtroPorTipoPaciente(List<Turno> listaTurnos, String tipoPaciente) {
        return Optional.of(listaTurnos.stream()
                .filter(turno -> turno.getTipoPaciente().equalsIgnoreCase(tipoPaciente))
                .toList());
    }
    //metodo para filtrar por el inicio
    public static Optional<List<Turno>> filtroPorInicio(List<Turno> listaTurnos, LocalDateTime desde, LocalDateTime hasta) {
        // Filtrar los turnos que tienen la misma fecha de inicio
        List<Turno> turnosFiltrados = listaTurnos.stream()
                .filter(turno -> turno.getFechaHoraInicio().isAfter(desde)
                        && turno.getFechaHoraInicio().isBefore(hasta))
                .collect(Collectors.toList());
                return turnosFiltrados.isEmpty() ? Optional.empty() : Optional.of(turnosFiltrados);
    }
    //metodo para el fin
    public static Optional<List<Turno>> filtroPorFin(List<Turno> listaTurnos, LocalDateTime inicio, LocalDateTime fin) {
        // Filtrar los turnos que tienen la misma fecha de fin
        List<Turno> turnosFiltrados = listaTurnos.stream()
                .filter(turno -> turno.getFechaHoraFin().isAfter(inicio)
                        && turno.getFechaHoraFin().isBefore(fin))
                .collect(Collectors.toList());
        return turnosFiltrados.isEmpty() ? Optional.empty() : Optional.of(turnosFiltrados);
    }
}
