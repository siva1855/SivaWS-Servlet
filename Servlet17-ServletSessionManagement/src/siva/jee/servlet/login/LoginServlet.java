package siva.jee.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = request.getParameter("userName");
		String password = request.getParameter("userPassword");

		RequestDispatcher requestDispatcher = null;

		response.setContentType("text/html");

		if (user.equals("siva") && password.equals("annapurna@1993")) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("abc123", user);
			requestDispatcher = request.getRequestDispatcher("profile");
			requestDispatcher.forward(request, response);
		} else {
			PrintWriter printWriter = response.getWriter();
			printWriter.println("Please Tyr Again You Have Entered Wrong username and password");
			printWriter.println("<br>");
			printWriter.println("<a href='LoginUser.html'>Login Again</a>");
		}
	}
}
