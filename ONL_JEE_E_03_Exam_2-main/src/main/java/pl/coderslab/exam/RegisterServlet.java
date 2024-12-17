package pl.coderslab.exam;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("githubLogin");

        if (login != null && !login.isEmpty()) {

            response.setContentType("text/html");


            response.getWriter().append("Login Info: ").append(login);
        } else {
            response.getWriter().append("No login info provided.");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().append("<html><body>")
                .append("<h2>Register</h2>")
                .append("<form method='POST' action='/register'>")
                .append("<label for='githubLogin'>GitHub Login:</label>")
                .append("<input type='text' id='githubLogin' name='githubLogin' required>")
                .append("<input type='submit' value='Submit'>")
                .append("</form>")
                .append("</body></html>");
    }
}
