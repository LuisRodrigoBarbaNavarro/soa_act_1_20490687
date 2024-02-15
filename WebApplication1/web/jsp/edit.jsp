<%--
    Document   : delete
    Created on : Feb 15, 2024, 1:21:00 AM
    Author     : luisr_6g40j75
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Editar Usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">
        <h3>Editar Usuario</h3>
        <form action="/edit" method="post">
            <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
            
            <div class="mb-3">
                <label for="name" class="form-label">Nombre:</label>
                <input type="text" id="name" name="name" class="form-control" value="<%= request.getParameter("name") %>" required>
            </div>
            
            <div class="mb-3">
                <label for="lastName" class="form-label">Apellido:</label>
                <input type="text" id="lastName" name="lastName" class="form-control" value="<%= request.getParameter("lastname") %>" required>
            </div>
            
            <button type="submit" class="btn btn-primary" name="action" value="edit">Save Changes</button>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
