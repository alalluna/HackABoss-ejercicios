<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.entities.Estudiante, com.example.entities.Candidato" %>
<!DOCTYPE html>
<html lang="en">
<%@ include file="partials/head.jsp" %>
<body>

    <%@ include file="partials/header.jsp" %>

    <!-- Contenedor de Bootstrap para centrar el contenido -->
    <div class="container d-flex flex-column justify-content-center align-items-center" style="min-height: 78vh;">
        <h1 class="mb-3">Formulario de Votación</h1>

        <!-- Formulario de Votación -->
        <form action="votacion" method="post" class="w-40">
            <!-- Nombre del Estudiante -->
            <div class="form-group">
                <label for="nombre">Nombre del Estudiante:</label>
                <input type="text" id="nombre" name="nombre" class="form-control" required>
            </div>

            <!-- Apellido del Estudiante -->
            <div class="form-group">
                <label for="apellido">Apellido del Estudiante:</label>
                <input type="text" id="apellido" name="apellido" class="form-control" required>
            </div>

            <!-- Candidato -->
            <div class="form-group">
                <label for="candidato">Seleccione Candidato:</label><br>

                <!-- Radio buttons para elegir el candidato -->
                <div class="form-check form-check-inline">
                    <input type="radio" name="candidato" value="A" id="candidatoA" class="form-check-input">
                    <label for="candidatoA" class="form-check-label">Candidato A</label>
                </div>

                <div class="form-check form-check-inline">
                    <input type="radio" name="candidato" value="B" id="candidatoB" class="form-check-input">
                    <label for="candidatoB" class="form-check-label">Candidato B</label>
                </div>

                <div class="form-check form-check-inline">
                    <input type="radio" name="candidato" value="C" id="candidatoC" class="form-check-input">
                    <label for="candidatoC" class="form-check-label">Candidato C</label>
                </div>
            </div>

            <!-- Botón de envío -->
            <button type="submit" class="btn btn-primary">Votar</button>
        </form>
    </div>

    <%@ include file="partials/footer.jsp" %>

</body>
</html>
