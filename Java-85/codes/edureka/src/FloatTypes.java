
public class FloatTypes {

	public static void main(String[] args) {
		//float sal = 2500.50; //Type mismatch: cannot convert from double to float
		//float sal = 2500.50f;
		//float sal = 2500.50F;
		float sal = (float)2500.50;
		System.out.println("My Salary = " + sal);
		
		double d = 2500.5;
		System.out.println(d);
		
		System.out.println(10.0 / 3);//-- returns double 3.3333333333333335
		System.out.println(10.0f / 3); //-- returns float 3.3333333
		
		System.out.println(Integer.toHexString(65));
	}
}
