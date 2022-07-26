package linkedlist_code;

import java.util.LinkedList;
import java.util.List;

public class Ll2 {
	
	public static void main(String[] args) {
		
		List<String> list1 = new LinkedList<String>();
		
		list1.add("Adarsh");
		list1.add("Bharat");
		list1.add("Ram");
		
		System.out.println(list1);
		
		list1.add(1, "Sanket");

		System.out.println(list1);
		
		List<String> list2 = new LinkedList<String>();
		
		list2.add("Vikash");
		list2.add("Rutik");
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		List<String> list3 = new LinkedList<String>();
		
		list3.add("Vaibhav");
		list3.add("kiran");
		
		list1.addAll(0, list3);
		
		System.out.println(list1);
		
		
		
		
		
	}

}
