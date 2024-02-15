<%-- 
    Document   : delete
    Created on : Feb 15, 2024, 1:21:00 AM
    Author     : luisr_6g40j75
--%>

<%@ page import="java.util.List" %>
<%@ page import="Model.Person" %>
<%@ page import="Model.PersonDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Lista de Usuarios</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">

        <div class="mb-3">
            <h3>Añadir Usuario</h3>
            <form action="/add" method="post">
                <div class="row g-3 align-items-center">
                    <div class="col-auto">
                        <label for="name" class="col-form-label">Nombre: </label>
                    </div>
                    <div class="col-auto">
                        <input type="text" id="name" name="name" class="form-control" required>
                    </div>
                    <div class="col-auto">
                        <label for="lastName" class="col-form-label">Apellido:</label>
                    </div>
                    <div class="col-auto">
                        <input type="text" id="lastName" name="lastName" class="form-control" required>
                    </div>
                    <div class="col-auto">
                        <button type="submit" class="btn btn-primary" name="action" value="add">Añadir</button>
                    </div>
                </div>
            </form>
        </div>
        <br>

        <h3>Lista de Usuarios</h3>
        <table class="table">
            <thead>
                <tr>
                    <th>Identificador</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
            <%
                List<Person> persons = PersonDAO.getAllPersons();

                for (Person person : persons) {
            %>
                <tr>
                    <td><%= person.getId() %></td>
                    <td><%= person.getName() %></td>
                    <td><%= person.getLastName() %></td>
                    <td>
                        <a href="/edit-pending?id=<%= person.getId() %>&name=<%= person.getName() %>&lastname=<%= person.getLastName() %>" class="btn btn-warning btn-sm">Edit</a>
                        <a href="/delete-pending?id=<%= person.getId() %>" class="btn btn-danger btn-sm">Delete</a>
                    </td>
                </tr>
            <%
                }
            %>
        </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
