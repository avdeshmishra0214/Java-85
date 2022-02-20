package co.edureka.ems.service;

import java.util.List;

import co.edureka.ems.dao.EmployeeDao;
import co.edureka.ems.dao.EmployeeDaoImpl;
import co.edureka.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private static EmployeeDao dao = null;	
	
	public EmployeeServiceImpl() throws Exception{
		if(dao == null)
			dao = new EmployeeDaoImpl();
	}

	public void newEmployee(Employee emp) throws Exception {
		Integer n = dao.saveEmployee(emp);
		if(n > 0 )
			System.out.println("###--- Employee Saved ---###");
	}

	public void updateEmployee(Employee emp) throws Exception {
		Integer n = dao.updateEmployee(emp);
		if(n > 0 )
			System.out.println("###--- Employee Updated ---###");		
	}

	public void deleteEmployee(Integer eno) throws Exception {
		Integer n = dao.deleteEmployeeByEmpNo(eno);
		if(n > 0 )
			System.out.println("###--- Employee Deleted ---###");
		else
			System.out.println("$$$--- No matching employee with EMPNO -> "+ eno + " for Deletion ---$$$");
	}

	public Employee getEmployeeByEmpNo(Integer eno) throws Exception {		
		return dao.findEmployeByEmpNo(eno);
	}

	public void getAllEmployees() throws Exception {
		List<Employee> emps = dao.findAllEmployees();
		
		for(Employee emp : emps) {
			System.out.println(emp);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
	}

}
