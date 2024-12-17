package pl.coderslab.exam;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/createCookie")
public class CreateCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/createCookie.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String value = request.getParameter("value");

        if (name != null && !name.isEmpty() && value != null && !value.isEmpty()) {
            Cookie cookie = new Cookie(name, value);
            cookie.setMaxAge(60 * 60 * 24);
            response.addCookie(cookie);

            response.sendRedirect(request.getRequestURI());
        }
    }
}