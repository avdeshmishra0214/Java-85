package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableMySQL {

	public static void main(String[] args) throws Exception {
		//-- initialize MySQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//--connect to MySQL database - edureka
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root", "root");
		
		//-- create an object for passing SQL query to connected DB
		Statement st = con.createStatement();
		
		//-- pass the query
		String sql = "CREATE TABLE EMP(EMPNO INT(5), ENAME VARCHAR(30), SALARY FLOAT(10,2), PRIMARY KEY(EMPNO))";
		
		try {
			st.execute(sql);
			System.out.println("###--- DB TABLE CREATED ---###");
		}
		catch(Exception ex) {
			System.out.println("$$$--- DB Table could not be created ---> " + ex.getMessage() + " ---$$$");
		}
		
		//-- close connection with DB
		st.close();
		con.close();
	}
}