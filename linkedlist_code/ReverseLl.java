/*
 *  Accept a LinkedLlist by adding data
 *  create a method a pass a LinkedLlist as parameter
 * in method implementation : iterate the LinkedLlist from the end to beginning 
 * store the data in a new LinkedLlist 
 * return the new LinkedLlist 
 * pass the LinkedLlist inside the custom method as parameter
 * store it in a different LinkedLlist 
 * print the LinkeLlist 
 */


package linkedlist_code;

import java.util.LinkedList;

public class ReverseLl {

	private static LinkedList<String>  reverseLinkedList(LinkedList<String> list)
	{
		LinkedList<String> revLl = new LinkedList<String>();
		
		for(int i = list.size()-1 ; i>=0;i--)
		{
			revLl.add(list.get(i));
		}
		
		return revLl;
		
		
	}
	
	
	public static void main(String[] args) {
		
		LinkedList<String> obj1 =new LinkedList<String>();
		
		obj1.add("Adarsh");
		obj1.add("Rajas");
		obj1.add("Sanket");
		
		System.out.println(obj1);
		
		obj1.addFirst("Bharat");
		obj1.addLast("Rohit");
		
		System.out.println(obj1);
		
		LinkedList<String> final_ll = reverseLinkedList(obj1);
		
		System.out.println(final_ll);
		
	}
	
	

}
