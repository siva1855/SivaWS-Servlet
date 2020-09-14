package siva.jee.servlet;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLifeCycle extends GenericServlet {

	private static final long serialVersionUID = 1L;

	public void init(ServletConfig servletConfig) throws ServletException{
		System.out.println("I am init()");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("I am service()");
	}

	public void destroy() {
		System.out.println("I am destroy()");
	}

}
