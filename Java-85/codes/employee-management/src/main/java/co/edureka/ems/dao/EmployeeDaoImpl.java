package co.edureka.ems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edureka.ems.configs.ConnectionFactory;
import co.edureka.ems.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Statement stmt;
	
	public EmployeeDaoImpl() throws Exception{
		Connection con = ConnectionFactory.getDBConnection();
		stmt = con.createStatement();
	}
	
	public Integer saveEmployee(Employee emp) throws Exception {
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSalary()+")";
		Integer employeesSaved = stmt.executeUpdate(sql);
		return employeesSaved;
	}

	public Integer updateEmployee(Employee emp) throws Exception {
		String sql = "update emp set ename='"+emp.getEname()+"', salary="+emp.getSalary()+" where empno="+emp.getEmpno();
		Integer employeesUpdated = stmt.executeUpdate(sql);
		return employeesUpdated;		
	}

	public Integer deleteEmployeeByEmpNo(Integer eno) throws Exception {
		String sql = "delete from emp where empno="+eno;
		return stmt.executeUpdate(sql);
	}

	public Employee findEmployeByEmpNo(Integer eno) throws Exception {
		Employee emp = null;
		
		String sql = "select ename, salary from emp where empno="+eno;
		ResultSet rs = stmt.executeQuery(sql);
		
		if(rs.next()) {
			String name = rs.getString(1);
			float sal = rs.getFloat(2);
			
			emp = new Employee(eno, name, sal);
		}
		
		return emp;
	}

	public List<Employee> findAllEmployees() throws Exception {
		List<Employee> emps = new ArrayList<Employee>();
		
		String sql = "select * from emp";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int eno = rs.getInt(1);
			String name = rs.getString(2);
			float sal = rs.getFloat(3);
			
			Employee emp = new Employee(eno, name, sal);
			emps.add(emp);
		}
		
		return emps;
	}
}
