package siva.jee.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletContextTest extends GenericServlet {

	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// way#1 to read context param

		/*
		 * ServletContext context = config.getServletContext(); String value1 =
		 * context.getInitParameter("data");
		 * System.out.println("ServletContext init method value is ::" + value1);
		 */

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// Way#2
		ServletContext context = req.getServletContext();
		String value2 = context.getInitParameter("data");
		System.out.println("ServletContext Service method value is ::" + value2);
	}

}
