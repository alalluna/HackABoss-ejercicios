<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%-- Importar las clases --%>
<%@ page import="java.util.List, com.maite.entities.Persona, com.maite.entities.Producto,  com.maite.entities.Tarjeta" %>

<!DOCTYPE html>
<html lang="en">
    <%@ include file="partials/head.jsp" %>
<body class="bg-success-subtle mt-5 mb-5">
    <%@ include file="partials/header.jsp" %>

    <section id="" class="d-flex align-items-center mb-5 mt-5">
        <div class="col-md-6 text-center">
            <h1 class="mb-2 mt-2">Personas Listado</h1>
            <p>Mensaje: <%= request.getAttribute("nombre") %></p>
            <ul>
                <% List<Persona> listado = (List<Persona>) request.getAttribute("listado");

                  for(Persona persona: listado) { %>

                      <li>Persona: <%= persona.getNombre() %>, <%= persona.getApellido() %>, Productos:

                           <% for (Tarjeta tarjeta : persona.getTarjetas()) { %>
                                <span class="tarjetas"> <%= tarjeta.getTipo() %>, </span>
                           <% } %>
                      </li>
                  <% } %>

            </ul>
       </div>
    </section>
    <%@ include file="partials/footer.jsp" %>
</body>
</html>
