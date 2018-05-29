package com.cts.dbserviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cts.bean.Employee;
import com.cts.dbconnection.DbConnection;
import com.cts.Exception.DuplicateUserException;
import com.cts.service.EmployeService;

public class EmployeeDbServiceImpl implements EmployeService{
    private Connection conn;
    private PreparedStatement preparestatement;
	@Override
	public boolean save(Employee emp) throws DuplicateUserException {
		try {
			conn=DbConnection.getconnection();
			preparestatement =conn.prepareStatement("insert into employee values(?,?,?,?)");
			preparestatement.setInt(1, emp.getId());
			preparestatement.setString(2, emp.getName());
			preparestatement.setInt(3, emp.getSalary());
			preparestatement.setInt(4, emp.getDeptId());
			preparestatement.execute();
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Employee emp) {
		try {
			conn=DbConnection.getconnection();
			preparestatement =conn.prepareStatement("UPDATE employee SET name =(?),salary=(?) WHERE id=(?)");
			
			preparestatement.setString(1, emp.getName());
			preparestatement.setInt(2, emp.getSalary());
			preparestatement.setInt(3, emp.getId());
			preparestatement.execute();
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		try {
			conn=DbConnection.getconnection();
			preparestatement =conn.prepareStatement("delete  from employee where id=(?)");
			preparestatement.setInt(1, id);
			preparestatement.execute();
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(List<Employee> empList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> get(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getemployeeGreaterAmount(int amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
