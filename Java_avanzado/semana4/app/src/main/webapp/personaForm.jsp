<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="partials/head.jsp" %>
<body>

    <%@ include file="partials/header.jsp" %>

  <div>
     <form action="/app/personaForm" method="post">

            <input type="text" name="nombre" id="nombre" placeholder="Ingrese el nombre" required >

            <br><br>

            <input type="text" name="apellido" id="apellido"  placeholder="Ingrese el apellido" required>

            <br><br>

            <button type="submit">Guardar Persona</button>

        </form>
  </div>

 <%@ include file="partials/footer.jsp" %>

</body>
</html>
