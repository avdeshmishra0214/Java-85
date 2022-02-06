import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape sh = null;
		
		System.out.print("type of shape required [1.Rectangle|2.Circle] :");
		int shapeType = sc.nextInt();
		
		switch(shapeType)
		{
		 case 1:
			sh = new Rectangle("red",12,9);
			break;
		 case 2:
			sh = new Circle("blue", 12.5f);
			break;
		 default:
			 System.out.println("$$$--- INVALID SHAPE SELECTED ---$$$");
			 return;
		}
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("SHAPE TYPE ---> " + sh.getClass().getName().toUpperCase());
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("Color of "+sh.getClass().getName() + " = " + sh.getColor());
		sh.area();
		sc.close();
	}
}
