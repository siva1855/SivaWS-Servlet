package siva.jee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/patterns/*")
public class ServletURLPatterns extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String value1 = request.getParameter("x");
		String value2 = request.getParameter("y");

		PrintWriter printWriter = response.getWriter();

		if (value1 == null || value2 == null) {
			printWriter.println("Provider valueOne,valueTwo ");
		} else {
			double d1 = Double.parseDouble(value1);
			double d2 = Double.parseDouble(value2);

			String uri = request.getRequestURI();

			if (uri.contains("addition")) {
				printWriter.println("Result is :: " + (d1 + d2));
			} else if (uri.contains("subtraction")) {
				printWriter.println("Result is :: " + (d1 - d2));
			} else if (uri.contains("division")) {
				printWriter.println("Result is :: " + (d1 - d2));
			} else if (uri.contains("multiplication")) {
				printWriter.println("Result is :: " + (d1 * d2));
			} else {
				printWriter.println("Result is not found");
			}
		}
	}
}
