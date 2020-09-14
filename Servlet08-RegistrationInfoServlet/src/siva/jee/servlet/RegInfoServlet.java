package siva.jee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegInfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter printWritter = response.getWriter();

		StringBuffer url = request.getRequestURL();
		String uri = request.getRequestURI();
		String queryString = request.getQueryString();
		String projectName = request.getContextPath();
		String methodName = request.getMethod();

		printWritter.println("URL is :: " + url.toString());
		printWritter.println();
		printWritter.println("URI is :: " + uri);
		printWritter.println();
		printWritter.println("Method Name is :: " + methodName);
		printWritter.println();
		printWritter.println("QueryString  is :: " + queryString);
		printWritter.println();
		printWritter.println("Context Path is :: " + projectName);

	}
}
