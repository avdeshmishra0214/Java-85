package co.edureka.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println(names + " | Size = " + names.size());
		System.out.println("is the list empty --> " + names.isEmpty());
		
		names.add("Ajay");
		names.add("Ajay");
		names.add("Praveen");		
		names.add("Sanjay");
		names.add("Pankaj");
		names.add("Jefferey");
		names.add("Ajay");
		
		System.out.println(names + " | Size = " + names.size());
		names.add(1, "Charles");
		names.set(2, "Chris");
		System.out.println(names + " | Size = " + names.size());
		
		System.out.println("is \"Ajay\" in list ---> " + names.contains("Ajay"));
		
		System.out.println("index of \"Ajay\" ---> " + names.indexOf("Ajay"));
		System.out.println("last index of \"Ajay\" ---> " + names.lastIndexOf("Ajay"));
		System.out.println("index of \"Sunil\" ---> " + names.indexOf("Sunil"));
		
		System.out.println(names.get(0));
		//System.out.println(names.get(10)); //java.lang.IndexOutOfBoundsException
		
		System.out.println("remove(object)   ---> " + names.remove("Ajay"));
		System.out.println("remove(int index) --> " + names.remove(0));
		
		System.out.println(names + " | Size = " + names.size());
		
		List<String> namesList = Arrays.asList("Sunil", "Anil", "Jeffery", "Mark", "Simon", "Sunil");
		System.out.println(namesList);
	}

}
