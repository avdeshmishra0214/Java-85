package co.edureka.ems.service;

import co.edureka.ems.dto.Employee;

public interface EmployeeService {
	
	void newEmployee(Employee emp) throws Exception;
	
	void updateEmployee(Employee emp) throws Exception;
	
	void deleteEmployee(Integer eno) throws Exception;
	
	Employee getEmployeeByEmpNo(Integer eno) throws Exception;
	
	void getAllEmployees() throws Exception;
}
