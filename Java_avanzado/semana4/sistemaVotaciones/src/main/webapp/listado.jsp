<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.List, com.example.entities.ListadoVotos" %>
<html lang="en">
    <%@ include file="partials/head.jsp" %>
<body>

    <%@ include file="partials/header.jsp" %>

    <!-- Contenedor Bootstrap para centrar el contenido -->
    <div class="container mt-5" style="min-height: 71vh;">
        <h1 class="text-center mb-4">Listado de Resultados</h1>

        <h2 class="text-center mb-4">Resultados de la Votación:</h2>

        <!-- Tabla de resultados -->
        <table class="table table-striped table-bordered">
            <thead>
                <tr>
                    <th>Candidato</th>
                    <th>Votos</th>
                </tr>
            </thead>
            <tbody>
                <!-- Lista de resultados de votación -->
                <%
                    List<ListadoVotos> resultadosVotos = (List<ListadoVotos>) request.getAttribute("resultadosVotos");
                    if (resultadosVotos != null) {
                        for (ListadoVotos votos : resultadosVotos) {
                %>
                    <tr>
                        <td><%= votos.getCandidato() %></td>
                        <td><%= votos.getVotos() %></td>
                    </tr>
                <%
                        }
                    }
                %>
            </tbody>
        </table>
    </div>

    <%@ include file="partials/footer.jsp" %>

</body>
</html>
