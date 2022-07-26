package linkedlist_code;

import java.util.LinkedList;
import java.util.List;
//import java.util.*;

public class Ll3_Remove {

	public static void main(String[] args) {
		
	

		List<String> list1 = new LinkedList<String>();
		
		list1.add("Ganesh");
		list1.add("Mahua");
		list1.add("Vaibhav");
		list1.add("Udvav");
		list1.add("Sunil");
		list1.add("David");
		list1.add("Michel");
		list1.add("Akexander");
		list1.add("Chris");
		list1.add("Luis");
		
		System.out.println(list1);
		
		System.out.println(list1.remove("Rohit"));
		
		System.out.println(list1.remove(0));
		
		System.out.println(list1);
		
		List<String> list2 = new LinkedList<String>();
		
		list2.add("Sunil");
		list2.add("Akexander");
		
		list1.remove("Vaibhav");
		list1.removeAll(list2);
		
		System.out.println(list1);
		
		list1.add("David");
		list1.add("Mahua");
		
		System.out.println(list1);
		
		list1.clear();
		
		System.out.println(list1);
		

	}

}
