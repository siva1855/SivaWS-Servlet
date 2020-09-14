package siva.jee.servlet.registerservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import siva.jee.servlet.dao.EmployeeDao;
import siva.jee.servlet.model.Employee;

@WebServlet("/register")
public class EmployeeRegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		String id = request.getParameter("empId");
		String name = request.getParameter("empName");
		String gender = request.getParameter("empGender");
		String address = request.getParameter("empAddress");

		int parseEmployeeId = Integer.parseInt(id);

		Employee employee = new Employee();

		employee.setEmployeeId(parseEmployeeId);
		employee.setEmployeeName(name);
		employee.setEmployeeGender(gender);
		employee.setEmployeeAddress(address);
		EmployeeDao employeeDao = EmployeeDao.getStaticFactoryMethodEmployeeDao();

		int count = employeeDao.insertEmployeeData(employee);

		PrintWriter printWriter = response.getWriter();
		
		if (count == 1) {
			printWriter.println("Successfully inserted data with record ID : " + parseEmployeeId);
		} else {
			printWriter.print("Check manully ... giving problem");
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("EmployeeRegister.html");
		requestDispatcher.include(request, response);
	}

}
