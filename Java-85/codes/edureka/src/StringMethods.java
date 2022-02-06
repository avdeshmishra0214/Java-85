import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka technologies";
		
		System.out.println("size = " + str.length());
		System.out.println("charAt(0) ---> " + str.charAt(0));
		//System.out.println("charAt(20) --> " + str.charAt(20)); //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("indexOf(e) --> " + str.indexOf("e"));
		System.out.println("indexOf(e) from 3 --> " + str.indexOf("e", 3));
		System.out.println("lastIndexOf(e) --> " + str.lastIndexOf("e"));
		System.out.println("indexOf(tech) --> " + str.indexOf("tech"));
		System.out.println("indexOf(java) --> " + str.indexOf("java")); //-1
		
		System.out.println(str.replace('e', '*'));
		System.out.println(str);
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		str = "Java is a programming language used for developing platform independent apps";
		String[] words = str.split(" ");
		System.out.println("No of Words = " + words.length);
		System.out.println(Arrays.toString(words));
	}
}
