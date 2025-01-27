<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="com.maite.entitites.Equipo" %>
<html lang="es">
<%@ include file="partials/head.jsp" %>
<body>
<%@ include file="partials/header.jsp" %>
    <h1>Listado de Equipos</h1>

    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Ciudad</th>
            </tr>
        </thead>
        <tbody>
            <!-- Recorrer la lista de equipos y mostrar sus datos -->
            <%
                List<Equipo> listaEquipos = (List<Equipo>)request.getAttribute("equipos");
                if (listaEquipos != null) {
                    for (Equipo equipo : listaEquipos) {
            %>
                        <tr>
                            <!--<td><%= equipo.getId() %></td>  incluir el ID -->
                            <td><%= equipo.getNombre() %></td>
                            <td><%= equipo.getCiudad() %></td>
                        </tr>
            <%
                    }
                }
            %>
        </tbody>
    </table>
        <%@ include file="partials/footer.jsp" %>
</body>
</html>
