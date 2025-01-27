package com.maite.servlets;

import com.maite.controllers.EquipoController;
import com.maite.controllers.PartidoController;
import com.maite.entitites.Equipo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/formularioPartido")
public class FormularioPartidoServlet extends HttpServlet {
    private final PartidoController partidoController = new PartidoController();
    private final EquipoController equipoController = new EquipoController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Obtener todos los equipos para que el usuario seleccione en el formulario
        List<Equipo> equipos = equipoController.listaEquipos();
        req.setAttribute("equipos", equipos);

        // Mostrar el formulario para registrar un partido
        req.getRequestDispatcher("formularioPartido.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Obtener los datos del formulario de partido
        Long idLocal = Long.parseLong(req.getParameter("equipoLocal"));
        Long idForaneo = Long.parseLong(req.getParameter("equipoForaneo"));
        String resultado = req.getParameter("resultado");

        // Registrar el nuevo partido usando el controlador
        partidoController.registrarPartido(idLocal, idForaneo, resultado);

        // Redirigir a la página de partidos después de registrar
        resp.sendRedirect(req.getContextPath() + "/partidos");
    }
}
