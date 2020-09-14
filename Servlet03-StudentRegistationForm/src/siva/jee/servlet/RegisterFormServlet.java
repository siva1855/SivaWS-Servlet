package siva.jee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegisterFormServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("YourName");

		String contact = req.getParameter("YourContact");
		// To Convert String To Long
		long contactNumber = Long.parseLong(contact);

		String gmail = req.getParameter("YourMail");
		String course = req.getParameter("YourCourse");
		String gender = req.getParameter("YourGender");
		String address = req.getParameter("YourAddress");
		
		String[] languages = req.getParameterValues("YourLanguage");
		// convert array data to List Type
		List<String> languagesList = Arrays.asList(languages);

		
		
		// display data
		PrintWriter printWriter = res.getWriter();

		printWriter.println(name);
		printWriter.println(contactNumber);
		printWriter.println(gmail);
		printWriter.println(course);
		printWriter.println(gender);
		printWriter.println(address);
		printWriter.println(languagesList);
	}

}
