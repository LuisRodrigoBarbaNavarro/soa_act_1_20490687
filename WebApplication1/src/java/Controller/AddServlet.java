package Controller;

/**
 *
 * @author luisr_6g40j75
 */

import java.io.IOException;

import Model.PersonDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("add".equals(request.getParameter("action"))) {

            String name = request.getParameter("name");
            String lastname = request.getParameter("lastName");

            PersonDAO.addPerson(name, lastname);

            response.sendRedirect(request.getContextPath() + "/");
        }
    }
}