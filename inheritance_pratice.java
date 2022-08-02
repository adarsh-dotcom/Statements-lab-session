package inheritance;

class Person
{
	int age;
	String name;
	Double height;
	void getdata(int a, String n, Double h)
	{
		age=a;
		name=n;
		height=h;
	}
	void show()
	{
		System.out.println(age+" "+name+" "+height);
	}
}
 class Singer extends Person
 {
	 int pay;
	 String name;
	 void getp(int p, String n)
	 {
		 pay=p;
		 name=n;
	 }
	 void getq()
	 {
		 System.out.println(pay+" "+name);
	 }
 }
 class Dancer extends Singer
 {
	 int fees;
	 String name;
	 void getm(int f, String n)
	 {
		 fees=f;
		 name=n;
	 }
	 void getn()
	 {
		 System.out.println(fees+" "+name);
	 }
 }
 class Player extends Dancer
 {
	 int age;
	 String name;
	 void geta(int a, String n)
	 {
		 age=a;
		 name=n;
	 }
	 void getb()
	 {
		 System.out.println(age+" "+name);
	 }
	 
 }
 public class inheritance_pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singer s = new Singer ();
		s.getp(23000, "Arjit Singh");
		s.getq();
		s.getdata(35, "Deepak", 5.6);
		s.show();
		
		Dancer d = new Dancer();
		d.getm(30000, "Michel Jackson");
		d.getn();
		s.getdata(37, "Kaustabh", 5.4);
		s.show();
		
		Player p = new Player();
		p.geta(52, "Sachin Tendulkar");
		p.getb();
		s.getdata(56, "Vishwajeet", 6.2);
		s.show();
	}

}
