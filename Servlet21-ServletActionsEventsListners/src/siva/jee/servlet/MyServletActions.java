package siva.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import siva.jee.session.bindinglistener.MySessionBindingListener;

@WebServlet("/test")
public class MyServletActions extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("--Request Attribute Related events--");
		request.setAttribute("user", "sivakumar");
		request.setAttribute("user", "praveen");
		request.removeAttribute("user");
		System.out.println("=====================================");

		System.out.println("--Session Attribute Related events--");
		HttpSession session = request.getSession();
		session.setAttribute("admin", "annapurna");
		session.setAttribute("admin", "saidarao");
		session.removeAttribute("admin");

		System.out.println("--Session Bind Related Events--");
		session.setAttribute("myObject", new MySessionBindingListener("ramadevi"));
		session.removeAttribute("myObject");
		session.invalidate();
		System.out.println("=====================================");

		System.out.println("--Context Attribute Related events--");
		ServletContext context = request.getServletContext();
		context.setAttribute("master", "durga");
		context.setAttribute("master", "raghu");
		context.removeAttribute("master");
		System.out.println("=====================================");
	}
}
