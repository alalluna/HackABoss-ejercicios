package com.example.servlets;

import com.example.controllers.CandidatoController;
import com.example.controllers.EstudianteController;
import com.example.entities.Estudiante;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/votacion")
public class VotacionServlet extends HttpServlet {
    private EstudianteController estudianteController = new EstudianteController();
    private CandidatoController candidatoController = new CandidatoController();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String candidato = req.getParameter("candidato");
        // Crear un nuevo estudiante y asignar el voto
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setCandidato(candidato);

        estudianteController.create(estudiante);

        resp.sendRedirect(req.getContextPath() + "/listado");
    }
}
