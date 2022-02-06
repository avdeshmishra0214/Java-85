
public class CharacterType {

	public static void main(String[] args) {
		char c = 'A';
		System.out.println(c);
		
		c = 65; //implicit typecasting
		System.out.println(c);
		
		c = '\u0041';
		System.out.println(c);
		
		c = '\u0905'; //Hindi
		System.out.println(c);
		
		c = '\u0c05'; //telugu
		System.out.println(c);
		
		c = '\u4eca'; //Japanese
		System.out.println(c);
	}
}
