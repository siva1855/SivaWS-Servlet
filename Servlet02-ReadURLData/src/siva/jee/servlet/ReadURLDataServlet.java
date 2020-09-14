package siva.jee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ReadURLDataServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		// reading Query Parameters
		String urlId = req.getParameter("id");
		// convert data Type from string to int
		int sid = Integer.parseInt(urlId);

		String sname = req.getParameter("name");
		
		String urlFee = req.getParameter("fee");
		// convert data Type from string to Double
		double sfee=Double.parseDouble(urlFee);
		
		// output data
		PrintWriter printWriter = res.getWriter();
		printWriter.println("Student Id is : " + sid);
		printWriter.println("Student Name is : " + sname);
		printWriter.println("Student Fee is : " + sfee);
	}

}
