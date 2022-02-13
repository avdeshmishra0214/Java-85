package co.edureka.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> marks = Arrays.asList(98,96,87,99,86,75);
		
		iterate1(marks);
		Thread.sleep(1000);
		
		iterate2(marks);
		Thread.sleep(1000);
		
		iterate3(marks);
		Thread.sleep(1000);	
		
		iterate4(marks);
		Thread.sleep(1000);	
		
		iterate5(marks);	
		
		System.out.println(marks);
		Collections.sort(marks);		
		System.out.println(marks);
	}

	private static void iterate1(List<Integer> marks) {
		System.out.println("<<< iterate using for loop and get() --- only for java.util.List");
		for(int i=0;i<marks.size();i++) {
			Integer n = marks.get(i);
			System.out.print(n + "    ");
		}
		System.out.println("\n");
	}
	
	private static void iterate2(List<Integer> marks) {
		System.out.println("<<< iterate using enhanced for loop");
		for(Integer n : marks) {
			System.out.print(n + "    ");
		}
		System.out.println("\n");
	}
	
	private static void iterate3(List<Integer> marks) {
		System.out.println("<<< iterate using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + "    ");
		}
		System.out.println("\n");
	}	 
	
	private static void iterate4(List<Integer> marks) {
		System.out.println("<<< iterate using java.util.ListIterator -- only for java.util.List");
		ListIterator<Integer> it = marks.listIterator();
		
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + "    ");
		}
		System.out.println("");
		
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n + "    ");
		}
		System.out.println("\n");
	}	
	
	private static void iterate5(List<Integer> marks) {
		System.out.println("<<< iterate using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(marks);
		
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n + "    ");
		}
		System.out.println("\n");
	}		
}
