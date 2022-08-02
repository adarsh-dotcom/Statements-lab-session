package inheritance;

class it_dept
{ //parent class
		
	int salary;
	int id;
	String name;
		
	void getdata(int s, int i, String n) 
	{
		salary=s;
		id=i;
		name=n;
		
	}
	void show()
	{
		System.out.println(salary+" "+id+" "+name);
	}
}

class HR extends it_dept
{ //child class
	double stipened;
	String internship;
	
	void getdata(double s,String i) 
	{
		stipened=s;
		internship=i;
	
	}
	void showdataHR()
	{
		System.out.println(stipened+" "+internship);
	}
}

public class Bank_inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

HR H=new HR();
H.getdata(12000, 12, "Adi");
H.getdata(2000, "HR");
H.show();
H.showdataHR();



	}
}
