<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.List",com.maite.entitites.Equipo,com.maite.entitites.Partido %>
<html lang="es">
<%@ include file="partials/head.jsp" %>
<body>
<%@ include file="partials/header.jsp" %>
    <h1>Listado de Partidos</h1>

    <table border="2">
        <thead>
            <tr>
                <th>ID Partido</th>
                <th>Equipo Local</th>
                <th>Equipo Foráneo</th>
                <th>Resultado</th>
                <th>Fecha</th>
            </tr>
        </thead>
        <tbody>
            <!-- Recorrer la lista de partidos y mostrar sus datos -->
            <%
                List<Partido> listaPartidos = (List<Partido>)request.getAttribute("partidos");
                if (listaPartidos != null) {
                    for (Partido partido : listaPartidos) {
            %>
                        <tr>
                              <!-- <td><%= partido.getId() %></td> Asegúrate de incluir el ID -->
                            <td><%= partido.getEquipoLocal() != null ? partido.getEquipoLocal().getNombre() : "N/A" %></td>
                            <td><%= partido.getEquipoForaneo() != null ? partido.getEquipoForaneo().getNombre() : "N/A" %></td>
                            <td><%= partido.getResultadoFinal() %></td>
                            <td><%= partido.getFecha() %></td>
                        </tr>
            <%
                    }
                }
            %>


        </tbody>
    </table>

    <br>
    <a href="formularios">Volver a los formularios</a>
<%@ include file="partials/footer.jsp" %>
</body>
</html>
