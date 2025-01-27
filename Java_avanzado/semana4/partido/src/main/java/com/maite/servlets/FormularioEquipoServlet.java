package com.maite.servlets;

import com.maite.controllers.EquipoController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/formularioEquipo")
public class FormularioEquipoServlet extends HttpServlet {
    private final EquipoController equipoController = new EquipoController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Mostrar el formulario para registrar un equipo
        req.getRequestDispatcher("formularioEquipo.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Obtener datos del formulario
        String nombre = req.getParameter("nombre");
        String ciudad = req.getParameter("ciudad");

        // Crear el nuevo equipo usando el controlador
        equipoController.generarEquipo(nombre, ciudad);

        // Redirigir a la página de equipos después de registrar
        resp.sendRedirect(req.getContextPath() + "/equipos");
    }
}
