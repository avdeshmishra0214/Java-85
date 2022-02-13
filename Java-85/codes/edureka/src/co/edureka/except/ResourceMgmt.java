package co.edureka.except;

import java.util.Scanner;

public class ResourceMgmt {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);) {
			System.out.print("enter otp: ");
			int otp = sc.nextInt();
			System.out.println("authentication with otp --> " + otp);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
}
