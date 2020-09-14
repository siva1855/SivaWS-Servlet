package siva.jee.servlet.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import siva.jee.servlet.dao.EmployeeDao;
import siva.jee.servlet.model.Employee;
import siva.jee.servlet.util.DBConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	
	public int insertEmployeeData(Employee employee) {
		String sqlQuery = "insert into employeetable values(?,?,?,?)";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int count = 0;
		try {
			connection = DBConnectionUtil.getDataBaseConnection();
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getEmployeeName());
			preparedStatement.setString(3, employee.getEmployeeGender());
			preparedStatement.setString(4, employee.getEmployeeAddress());
			count = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
}
