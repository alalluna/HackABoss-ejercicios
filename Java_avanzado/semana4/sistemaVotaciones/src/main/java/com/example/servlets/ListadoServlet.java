package com.example.servlets;

import com.example.controllers.CandidatoController;
import com.example.controllers.EstudianteController;
import com.example.entities.Candidato;
import com.example.entities.Estudiante;
import com.example.entities.ListadoVotos;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/listadoServlet")
public class ListadoServlet extends HttpServlet {
    private EstudianteController estudianteController = new EstudianteController();
    private CandidatoController candidatoController = new CandidatoController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ListadoVotos> resultadosVotos = estudianteController.contarVotos();
        List<Estudiante> estudiantes = estudianteController.findAll();
        List<Candidato> candidatos = candidatoController.findAll();

        req.setAttribute("resultadosVotos", resultadosVotos);
        req.setAttribute("estudiantes", estudiantes);
        req.setAttribute("candidatos", candidatos);

        req.getRequestDispatcher("listado.jsp").forward(req,resp);
    }
}
