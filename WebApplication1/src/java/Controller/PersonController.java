package Controller;

/**
 *
 * @author luisr_6g40j75
 */

import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;

import Model.Person;
import Model.PersonDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PersonController")
public class PersonController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lógica de controlador para el botón
        String mensajeHTML = "<p>¡Hola!.</p>";

        // Configurar el tipo de contenido de la respuesta
        response.setContentType("text/html");

        // Obtener el PrintWriter para escribir la respuesta
        PrintWriter out = response.getWriter();

        // Escribir el mensaje HTML en la respuesta
        out.println(mensajeHTML);
    }
}

