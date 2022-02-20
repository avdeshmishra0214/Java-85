package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDBConnection(); 
		
		Statement st = con.createStatement();
		
		String sql = "select * from emp";
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int empno = rs.getInt(1);
			String name = rs.getString(2);
			//float sal = rs.getFloat(3);
			float sal = rs.getFloat("salary");
			
			//String employee = String.format("%4d | %-10s | %.2f", empno, name, sal);
			String employee = String.format("%d ---> %4d | %-10s | %.2f", rs.getRow(), empno, name, sal);
			
			System.out.println(employee);
			Thread.sleep(1500);
		}
		
		rs.close();
		st.close();
		con.close();
	}

}
