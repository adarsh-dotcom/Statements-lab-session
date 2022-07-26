// LinkedList is a Java Class it uses doubly linked list data structure to store data.
// Features of LinkkedList class as same as ArrayList : 1. Allow duplicates and 2. Maintain insertion order


package linkedlist_code;

import java.util.Iterator;
import java.util.LinkedList;

public class First_Ll {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(101);
		list1.add(201);
		list1.add(301);
		
		Iterator<Integer> itr = list1.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		
	
	}

}
