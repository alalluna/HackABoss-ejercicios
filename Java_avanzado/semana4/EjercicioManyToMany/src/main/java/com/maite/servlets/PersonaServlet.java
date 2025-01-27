package com.maite.servlets;

import com.maite.controllers.PersonaController;
import com.maite.entities.Persona;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/persona")
public class PersonaServlet extends HttpServlet {

    private PersonaController personaController = new PersonaController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Persona> listado = personaController.findAll();

//        listado.forEach(persona ->persona.getProductos()
//                .forEach(producto->
//                        System.out.println("producto" + producto.getNombre())));
        listado.forEach(persona-> persona.getTarjetas()
                    .forEach(tarjeta ->
                            System.out.println(persona.getNombre()+ " tiene la tarjeta" + tarjeta.getTipo())));



        /*Enviar info al jsp*/
        req.setAttribute("listado", listado);
        req.setAttribute("nombre", "Brian");

        req.getRequestDispatcher("persona.jsp").forward(req, resp);
    }
}
