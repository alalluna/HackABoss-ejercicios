package com.maite.servlets;

import com.maite.controllers.EquipoController;
import com.maite.entitites.Equipo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/equipos")
public class EquipoServlet extends HttpServlet {
    private final EquipoController equipoController = new EquipoController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {;
        List<Equipo> equipos = equipoController.listaEquipos();
        req.setAttribute("equipos", equipos);
        req.getRequestDispatcher("listadoEquipo.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String ciudad = req.getParameter("ciudad");

        equipoController.generarEquipo(nombre, ciudad);
        resp.sendRedirect(req.getContextPath() + "/equipos");
    }
}
