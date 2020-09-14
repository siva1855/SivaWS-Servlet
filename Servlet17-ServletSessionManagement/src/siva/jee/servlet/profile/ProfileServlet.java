package siva.jee.servlet.profile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		HttpSession httpSession=request.getSession(false);
		
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		
		if(httpSession!=null) {
			Object obj=httpSession.getAttribute("abc123");
			printWriter.println("Welcome to User :: "+obj);
			printWriter.println("<br>");
			printWriter.print("<a href='logout'>Logout</a>");
		}else {
			printWriter.print("You are not logged in ");
			printWriter.println("<br>");
			printWriter.print("<a href='LoginUser.html'>Please Login</a>");
		}
	}
}
