package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class InsertEmployee {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		/*
		String sql = "insert into emp values(101, 'Sunil', 2500)";		
		int rowsInserted = st.executeUpdate(sql);
		*/
		
		String sql = "insert into emp(empno, ename, salary) values(102, 'Anil', 2500),"
				+ "(103,'Praveen', 3500), (104,'Sanjay', 4500), (105, 'Mohan', 5500),"
				+ "(106, 'Charles', 2750)";
		
		int rowsInserted = st.executeUpdate(sql);
		
		System.out.println("employees saved --> " + rowsInserted);
		
		st.close();
		con.close();
	}

}
