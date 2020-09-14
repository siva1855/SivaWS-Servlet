package siva.jee.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletConfigInitTest extends GenericServlet {

	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {

		String value1 = config.getInitParameter("data");
		System.out.println("Servlet config init value is :: " + value1);
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service method call....");

	}

}
