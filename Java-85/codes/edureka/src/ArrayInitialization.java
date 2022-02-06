
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {95,88,93,71,82,65};
		
		System.out.println("No of Subjects = " + marks.length);
		
		/*-- array iteration using for loop --*/
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("subject-"+(i+1) + " = " + marks[i]);
		}
		
		/*--- array iteration using enhanced for loop --*/
		System.out.print("marks obtained   ---> ");
		for(int mark : marks)
		{
			System.out.print(mark + " | ");
		}
		System.out.println();
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
