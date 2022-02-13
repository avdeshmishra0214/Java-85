package co.edureka.util;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 10 ;i>0; i--) {
			q.add(i);
		}
		
		System.out.println(q);
		System.out.println("---> " + q.poll());
		
		System.out.println(q);
		System.out.println("---> " + q.poll());
		
		System.out.println(q);
		System.out.println("---> " + q.poll());		
		
		System.out.println(q);		
	}

}
