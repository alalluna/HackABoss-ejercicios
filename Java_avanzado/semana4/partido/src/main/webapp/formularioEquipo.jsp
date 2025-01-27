<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="es">
<%@ include file="partials/head.jsp" %>
<body>
    <%@ include file="partials/header.jsp" %>
    <h1>Formulario de Registro de Equipos</h1>

    <!-- Formulario para registrar un equipo -->
    <h2>Registrar Equipo</h2>
    <form action="formularioEquipo" method="POST">
            <label for="nombre">Nombre del Equipo:</label>
            <input type="text" id="nombre" name="nombre" required>
            <br>
            <label for="ciudad">Ciudad del Equipo:</label>
            <input type="text" id="ciudad" name="ciudad" required>
            <br>
            <input type="submit" value="Registrar Equipo">
        </form>

    <br>
     <%@ include file="partials/footer.jsp" %>
</body>
</html>
