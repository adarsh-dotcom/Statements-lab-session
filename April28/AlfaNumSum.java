package April28;
import java.util.Scanner;
public class AlfaNumSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		char c1;
		int sum=0;
		
		for (int i=0;i<s.length();i++) {
			c1= s.charAt(i);
				
			if(c1>47 && c1<58) {
				int n=c1;
			
			switch(n) {
			case 48:
				int v=0;
				sum=sum+v;
				break;
				
			case 49:
				v=1;
				sum=sum+v;
				break;
				
			case 50:
				v=2;
				sum=sum+v;
				break;
				
			case 51:
				v=3;
				sum=sum+v;
				break;
				
			case 52:
				v=4;
				sum=sum+v;
				break;
				
			case 53:
				v=5;
				sum=sum+v;
				break;
				
			case 54:
				v=6;
				sum=sum+v;
				break;
				
			case 55:
				v=7;
				sum=sum+v;
				break;
				
			case 56:
				v=8;
				sum=sum+v;
				break;
		
			case 57:
				v=9;
				sum=sum+v;
				break;
			}
			}
		}
		System.out.println(sum);		
	}
}

