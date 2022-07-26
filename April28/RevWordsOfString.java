package April28;

import java.util.Scanner;

public class RevWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
//		String s="My Name is XYZ";
		String r="";
		String s2="";
		String []arr = s.split(" ",0/1);
		
		for (int i=arr.length-1 ;i>=0;i--) {
			r=" "+arr[i];
			System.out.print(r);
		}	
	}
}
