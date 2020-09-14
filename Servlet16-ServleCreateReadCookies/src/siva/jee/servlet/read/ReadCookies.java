package siva.jee.servlet.read;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReadCookies extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cookie[] cookie = request.getCookies();

		PrintWriter printWriter = response.getWriter();

		if (cookie != null && cookie.length != 0) {
			for (int i = 0; i < cookie.length; i++) {
				printWriter.println("Cookie Name :: " + cookie[i].getName() + "  Cookie Value :: " + cookie[i].getValue());

			}
		} else {
			printWriter.println("No Cookies Found.....");
		}
	}
}
