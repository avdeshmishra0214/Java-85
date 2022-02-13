package co.edureka.io;

import java.io.FileWriter;

public class WriteFile1 {

	public static void main(String[] args) throws Exception {
		FileWriter fout = new FileWriter("src/co/edureka/io/edureka1.txt");
		
		String str = "World’s #1 E-Learning Platform. \nEdureka's online training helps you land your dream job. \n"
				+ "Best-selling technology certification courses co-created with global industry experts. \n"
				+ "Instructor-led Classes. 24/7 Lifetime Support. \n"
				+ "No Cost EMI Option. Flexible Batch Timings.";
		
		fout.write(str);
		
		System.out.println("file saved");
		fout.close();

	}

}
