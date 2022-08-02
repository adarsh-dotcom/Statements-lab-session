package inheritance;
class staff
{
	int id;
	String name;
	void getdata(int i,String n)
	{
		id=i;
		name=n;
	}
	void showstaff()
	{
		System.out.println(id+" "+name);
	}
}
	class clerk extends staff
	{
		int no;
		String dept;
		void passdata(int n, String d)
		{
			no=n;
			dept=d;
		}
		void showdept()
		{
			System.out.println(no+" "+dept);
		}
	}
			
	class canteen extends clerk
	{
		int bill;
		String menu;
		void paydata(int b, String m)
		{
			bill=b;
			menu=m;
		}
		void show()
		{
			System.out.println(bill+" "+menu);
		}
	}
public class bank_inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clerk c = new clerk();
		c.passdata(123, "aadi");
		c.showdept();
		
		canteen ca = new canteen();
		ca.paydata(345,"Paneer Masala");
		ca.show();
		
		staff s = new staff();
		s.getdata(161002, "Bank");
		s.showstaff();
		
		
			
		
		
	}
}
	
	
	
