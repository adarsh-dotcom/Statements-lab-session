package interface_scenario;

import java.util.Scanner;

public class SmartPhoneFactory {
	
	Scanner sc = new Scanner(System.in);

	int getRam()
	{
		System.out.println("Enter RAM : ");
		int ram=sc.nextInt();
		
		return ram;
	}
	
	double getPrice()
	{
		System.out.println("Enter Price : ");
		int price=sc.nextInt();
		
		return price;
	}
	
	
	SmartPhone getSmartPhone()
	{
		
		
		System.out.println("Enter Brand name of mobile ");
		String bname = sc.nextLine();
		
		System.out.println("Enter Modelname name of mobile ");
		String mname = sc.nextLine();
		
		if(bname.equalsIgnoreCase("Redmi"))
		{
			return new Redmi(mname,getRam(),getPrice());
		}
		
		else if (bname.equalsIgnoreCase("Samsung"))
		{
			return new Samsung(mname,getRam(),getPrice());
		}
		
		else return null;
		
		
	}
}
