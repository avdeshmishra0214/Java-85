package co.edureka.except;

import java.sql.SQLException;

public class ThrowsTest {

	public static void main(String[] args) throws SQLException, InterruptedException {
		Sunil sunil = new Sunil();
		try {
			sunil.getUserDetails();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		
		sunil.getUserDetails();
	}

}
