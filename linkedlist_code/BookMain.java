/*
 * ARRAYLIST & LINKEDLIST DIFFERENCE : 
 * 
 * INTERNALLY Uses :  dynamic array 		-- 		doubly linked list
 * Manipulation : 	SLOW as if any element moved others are also shifted in memory  -- 		 Fast as no shifting
 * ACT As  :  Only List type 			--- 		List as well as queue 
 * Uses : Good for accessing the data 		--- manipulating the data  
 * 
 */




package linkedlist_code;

import java.util.LinkedList;

public class BookMain {

	public static void main(String[] args) {
		
		Book b1 = new Book(100, "Satyajit Roy", "Detective");
		Book b2 = new Book(110, "D. Moulik", "Physics");
		Book b3 = new Book(150, "Jyoti Prakash", "C programming");
		
		
		LinkedList<Book> l1 = new LinkedList<Book>();
		
		l1.add(b1);
		l1.addLast(b2);
		l1.addFirst(b3);
		
		for(Book b : l1)
		{
			System.out.println( b.getAuthorname()+ " "+ b.getGenre());
		}

	}

}
