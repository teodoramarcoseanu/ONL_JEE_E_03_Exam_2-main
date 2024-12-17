package pl.coderslab.exam;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/deleteCookie")
public class DeleteCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/deleteCookie.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nameToDelete = request.getParameter("nameToDelete");


        if (nameToDelete != null && !nameToDelete.isEmpty()) {
            Cookie cookie = new Cookie(nameToDelete, "");
            cookie.setMaxAge(0);
            response.addCookie(cookie);


            response.sendRedirect(request.getRequestURI());
        }
    }
}