package co.edureka;

public class WrapperTest1 {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(25);
		
		byte b = i.byteValue();
		short s = i.shortValue();
		int n = i.intValue();
		long l = i.longValue();
		
		float f = i.floatValue();
		double d = i.doubleValue();
		
		System.out.println(b+" | "+s+" | "+n+" | "+l);
		System.out.println(f+" | "+d);
		
		System.out.println("binary value of 255 = " + Integer.toBinaryString(255));
		System.out.println("octal value of 255 = " + Integer.toOctalString(255));
		System.out.println("hexa decimal value of 255 = " + Integer.toHexString(255));
	}

}
