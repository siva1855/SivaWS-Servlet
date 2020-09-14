package siva.jee.servlet.create;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookies extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("userId");
		String name = request.getParameter("userName");

		Cookie cookie1 = new Cookie("uid", id);
		Cookie cookie2 = new Cookie("uname", name);

		cookie1.setMaxAge(600);
		cookie2.setMaxAge(600);

		response.addCookie(cookie1);
		response.addCookie(cookie2);

		PrintWriter printWriter = response.getWriter();
		printWriter.println(" Cookies Created");

	}
}
