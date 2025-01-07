package codeaConmigoTurnos.entitites;

import java.time.LocalDateTime;

public class Turno {
    private Integer idTurno;
    private String nombrePaciente;
    private String tipoPaciente;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;

    //Constructor
    public Turno(Integer idTurno, String nombrePaciente, String tipoPaciente, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin) {
        this.idTurno = idTurno;
        this.nombrePaciente = nombrePaciente;
        this.tipoPaciente = tipoPaciente;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
    }

    //getters y setters

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    //tostring

    @Override
    public String toString() {
        return "Turno "+ idTurno +
                ": " + nombrePaciente + '\'' +
                ", fue atendido/a por " + tipoPaciente + '\'' +
                ", desde las " + fechaHoraInicio +
                " hasta las " + fechaHoraFin ;
    }
}
