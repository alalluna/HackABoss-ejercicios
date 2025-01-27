package com.maite.servlets;

import com.maite.controllers.PartidoController;
import com.maite.entitites.Partido;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/partidos")
public class PartidoServlet extends HttpServlet {
    private final PartidoController partidoController = new PartidoController();

    // Mostrar la lista de partidos
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Partido> partidos = partidoController.listaPartidos();
        req.setAttribute("partidos", partidos);
        req.getRequestDispatcher("partidos.jsp").forward(req, resp);
    }

    // Registrar un nuevo partido
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long idLocal = Long.parseLong(req.getParameter("equipoLocal"));
        Long idForaneo = Long.parseLong(req.getParameter("equipoForaneo"));
        String resultado = req.getParameter("resultado");

        partidoController.registrarPartido(idLocal, idForaneo, resultado);
        resp.sendRedirect(req.getContextPath() + "/partidos");
    }
}
