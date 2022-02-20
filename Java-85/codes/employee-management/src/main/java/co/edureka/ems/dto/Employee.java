package co.edureka.ems.dto;

public class Employee {
	private Integer empno;
	private String ename;
	private Float salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Integer empno, String ename, Float salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		String formattedEmployee = String.format("Employee[%-3d | %-12s | %.2f]", empno, ename, salary);
		return formattedEmployee;
	}
	
	
}
