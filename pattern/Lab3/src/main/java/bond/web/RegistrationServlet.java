package bond.web;

import org.apache.commons.codec.digest.DigestUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.Cookie;
import java.util.UUID;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("join.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = (String) request.getParameter("login");
        String password = (String) request.getParameter("password");
        String confirmPassword = (String) request.getParameter("confirmPassword");


        if (password.equals(confirmPassword)) {

            password = DigestUtils.md5Hex(password);
            DAOLoginPassword dao = new DAOLoginPassword();
            boolean isOK = dao.isContainLogin(login);
            if (!isOK){
                boolean isOk = dao.addLoginPassword(login, password);
                response.sendRedirect("login");
            }
            else {
                String answerLoginBusy = "This login is busy";
                response.getWriter().println(answerLoginBusy);
            }
        }
        else {
            request.getRequestDispatcher("join.jsp").forward(request, response);
        }
    }

}
