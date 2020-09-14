package siva.jee.servlet.post;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/postServlet")
public class HttpPostMethod extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h1>Student Resistration Form Data</h1>");
		printWriter.print("<p> firstName :: " + firstName + "</p>");
		printWriter.print("<p> lastName :: " + lastName + "</p>");
		printWriter.print("<p> GMail :: " + emailId + "</p>");
		printWriter.print("<p> Password :: " + password + "</p>");
		printWriter.print("</body>");
		printWriter.print("</html>");
		printWriter.close();

		System.out.println("firstName :: " + firstName);
		System.out.println("lastName :: " + lastName);
		System.out.println("emailId :: " + emailId);
		System.out.println("password :: " + password);
	}
}
