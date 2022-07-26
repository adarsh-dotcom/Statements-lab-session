package linkedlist_code;

import java.util.LinkedList;

public class LinkedListToArray {
	
	/**
	 * @return
	 */
	private static LinkedList<String> input() {
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("Messi");
		l1.add("Dinho");
		l1.add("Kaka");
		l1.add("Zidane");
		return l1;
	}
	

	private static String[] llToArray(LinkedList<String> list)
	{
		String[] sar = new String[list.size()];
		
		for(int i = 0;i<=list.size()-1;i++)
		{
			sar[i] = list.get(i);
		}
		
		return sar;
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> l1 = input();
		
		System.out.println("Actual Linked List  : " + l1 );
		
	//	String[] output =  llToArray(l1);
		
		for(String str : llToArray(l1)) // output from last line 
		{
			System.out.println(str+ " ");
		}
	}

	

}
