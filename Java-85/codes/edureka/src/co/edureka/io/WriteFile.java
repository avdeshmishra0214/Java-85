package co.edureka.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		
		String str = "World’s #1 E-Learning Platform. \nEdureka's online training helps you land your dream job. \n"
				+ "Best-selling technology certification courses co-created with global industry experts. \n"
				+ "Instructor-led Classes. 24/7 Lifetime Support. \n"
				+ "No Cost EMI Option. Flexible Batch Timings.";
		
		byte[] b = str.getBytes();
		
		fout.write(b);
		
		System.out.println("file saved");
		fout.close();
	}
}