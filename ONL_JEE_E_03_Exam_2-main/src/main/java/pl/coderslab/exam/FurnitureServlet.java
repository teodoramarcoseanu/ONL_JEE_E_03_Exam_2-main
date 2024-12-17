
package pl.coderslab.exam;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
        import java.io.IOException;
import java.util.List;

@WebServlet("/furniture")
public class FurnitureServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Furniture> furnitureList = (List<Furniture>) session.getAttribute("furnitureList");

        if (furnitureList == null) {
            FurnitureDao furnitureDao = new FurnitureDao();
            furnitureList = furnitureDao.getList();
            session.setAttribute("furnitureList", furnitureList);
        }

        request.setAttribute("furnitureList", furnitureList);
        request.getRequestDispatcher("/WEB-INF/view/furniture.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String removeId = request.getParameter("removeId");

        if (removeId != null) {
            HttpSession session = request.getSession();
            List<Furniture> furnitureList = (List<Furniture>) session.getAttribute("furnitureList");

            if (furnitureList != null) {
                furnitureList.removeIf(furniture -> String.valueOf(furniture.getId()).equals(removeId));
            }

            session.setAttribute("furnitureList", furnitureList);
        }

        response.sendRedirect(request.getRequestURI());
    }
}
