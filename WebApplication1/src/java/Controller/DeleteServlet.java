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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("delete".equals(request.getParameter("action"))) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));

                PersonDAO.deletePerson(id);

                response.sendRedirect(request.getContextPath() + "/");

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}