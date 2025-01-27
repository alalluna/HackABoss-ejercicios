<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%-- Importar las clases --%>
<%@ page import="java.util.List, com.maite.entities.Persona" %>

<!DOCTYPE html>
<html lang="en">
    <%@ include file="partials/head.jsp" %>
<body class="bg-success-subtle" "container mt-5 mb-5">
    <%@ include file="partials/header.jsp" %>

    <form action="/app/personaForm" method="post">

        <input type="text" name="nombre" id="nombre" placeholder="Ingrese el nombre" required >

        <br><br>

        <input type="text" name="apellido" id="apellido"  placeholder="Ingrese el apellido" required>

        <br><br>

        <button type="submit">Guardar Persona</button>

    </form>
     <%@ include file="partials/footer.jsp" %>
    </body>
    </html>
