import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int x = sc.nextInt();
		
		System.out.print("enter second no: ");
		int y = sc.nextInt();
		
		int lar = (x > y) ? x : y;
		
		System.out.println("Largest = " + lar);
		System.out.println("Largest of ("+ x + "," + y + ") is "+ lar);
		
		System.out.print("enter your name: ");
		String name = sc.next();
		System.out.println("I am " + name);
		sc.nextLine();
		
		System.out.print("enter your name: ");
		String fullName = sc.nextLine();
		System.out.println("I am " + fullName);		
		sc.close();
	}

}
