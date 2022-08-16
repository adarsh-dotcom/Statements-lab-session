package Interface;
import java.util.Scanner;
interface clients

{
	void input();
	void output();
}


class aadi_pingale implements clients

{
	String name;
	double salary;
	public void input()
	
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a username");
	    name=sc.nextLine(); 
			
	    System.out.println("Enter a salary");
	    salary=sc.nextDouble();
	}
	
	public void output()
	
	{
	System.out.println(name+" "+salary);
	}
	
	public static void main(String args[])
	
	{
	aadi_pingale a=new aadi_pingale();
	a.input();
	a.output();
	}
	
}




