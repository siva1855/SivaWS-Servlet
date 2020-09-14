package siva.jee.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validations extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String user = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		
		if (user.equals("siva") && password.equals("annapurna@1993")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcomeXml");
			requestDispatcher.forward(request, response);
		} else {
			printWriter.print("User name or password is incorrect!");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.include(request, response);
		}

	}
}
