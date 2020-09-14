package siva.jee.servlet.dao;

import siva.jee.servlet.daoimpl.EmployeeDaoImpl;
import siva.jee.servlet.model.Employee;

public interface EmployeeDao {

	public int insertEmployeeData(Employee employee);
	
	public static EmployeeDao getStaticFactoryMethodEmployeeDao() {
		return new EmployeeDaoImpl();
	}
}
