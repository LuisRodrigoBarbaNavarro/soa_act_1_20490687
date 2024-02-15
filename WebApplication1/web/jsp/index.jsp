<%@ page import="java.util.List" %>
<%@ page import="Model.Person" %>
<%@ page import="Model.PersonDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>List of Persons</title>
    </head>
    <body>
        <h1>List of Persons</h1>

        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Last Name</th>
                </tr>
            </thead>
            <tbody>
                <!-- Populate the table with person data -->
                <%
                    // Retrieve data from the database (you can use JDBC or an ORM framework)
                    List<Person> persons = PersonDAO.getAllPersons();

                    // Iterate over the list of persons and display in the table
                    for (Person person : persons) {
                %>
                <tr>
                    <td><%= person.getId() %></td>
                    <td><%= person.getName() %></td>
                    <td><%= person.getLastName() %></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>

        <form action="/PersonController" method="post">
            <button type="submit">Mostrar Mensaje (Hola)</button>
        </form>

        <form action="/PersonController/World" method="post">
            <button type="submit">Mostrar Mensaje (Mundo)</button>
        </form>
    </body>
</html>
