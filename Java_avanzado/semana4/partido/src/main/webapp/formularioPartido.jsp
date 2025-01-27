<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.List,com.maite.entitites.Equipo" %>
<html lang="es">
<%@ include file="partials/head.jsp" %>
<body>
    <%@ include file="partials/header.jsp" %>
    <h1>Formulario de Registro de Partidos</h1>

    <!-- Formulario para registrar un partido -->
    <h2>Registrar Partido</h2>
    <form action="formularioPartido" method="POST">
            <label for="equipoLocal">Equipo Local:</label>
            <select id="equipoLocal" name="equipoLocal" required>
                <%
                    List<Equipo> equipos = (List<Equipo>) request.getAttribute("equipos");
                    if (equipos != null) {
                        for (Equipo equipo : equipos) {
                %>
                            <option value="<%= equipo.getId() %>"><%= equipo.getNombre() %></option>
                <%
                        }
                    }
                %>
            </select>
            <br>
            <label for="equipoForaneo">Equipo Foráneo:</label>
            <select id="equipoForaneo" name="equipoForaneo" required>
                <%
                    if (equipos != null) {
                        for (Equipo equipo : equipos) {
                %>
                            <option value="<%= equipo.getId() %>"><%= equipo.getNombre() %></option>
                <%
                        }
                    }
                %>
            </select>
            <br>
            <label for="resultado">Resultado:</label>
            <input type="text" id="resultado" name="resultado" required>
            <br>
            <input type="submit" value="Registrar Partido">
        </form>
     <%@ include file="partials/footer.jsp" %>
</body>
</html>
