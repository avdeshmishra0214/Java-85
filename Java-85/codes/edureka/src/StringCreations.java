
public class StringCreations {

	public static void main(String[] args) {
		String s1 = "edureka";
		String s2 = "edureka";
		System.out.println("s1==s2 ----> " + (s1==s2));
		
		String s3 = new String("Java");
		//String s4 = new String("Java");
		String s4 = new String("java");
		System.out.println("s3==s4 ----> " + (s3==s4));
		
		//s1.concat(" tech");
		s1 = s1.concat(" tech");
		System.out.println(s1);
		
		System.out.println("equals() ---> " + s3.equals(s4));
		System.out.println("contentEquals() ---> " + s3.contentEquals(s4));
		System.out.println("equalsIgnoreCase() ---> " + s3.equalsIgnoreCase(s4));
	}
}
