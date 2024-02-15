<%-- 
    Document   : delete
    Created on : Feb 15, 2024, 1:21:00 AM
    Author     : luisr_6g40j75
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Delete Confirmation</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">
        <h3>Confirmación de Eliminación</h3>
        <p>¿Estás seguro de que deseas eliminar este registro?</p>
        
        <form action="/delete" method="post">
            <input type="hidden" name="action" value="delete">
            <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
            
            <button type="submit" class="btn btn-danger">Confirmar Eliminación</button>
            <a href="/" class="btn btn-secondary" name="action" value="delete">Cancelar</a>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

