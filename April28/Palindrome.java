package April28;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		String s1="";
		
	
		for(int i=s.length()-1 ; i>=0 ;i--) {
				s1=s1+s.charAt(i);
		}	
		System.out.println(s1);
	
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	
	}
}
