package siva.jee.servlet.logout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession httpSession = request.getSession(false);
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();

		if (httpSession != null) {
			httpSession.removeAttribute("abc123");
			httpSession.invalidate();
		}
		printWriter.println("Successfully logged out");
		printWriter.println("<br>");
		printWriter.println("<a href='LoginUser.html'>Login Here</a>");
	}
}
