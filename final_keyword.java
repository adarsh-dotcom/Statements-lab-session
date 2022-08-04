package polymorphism;

final class finalDemo
{
	void display()
	{
		System.out.println("This is normal method in final class");
	}
}

class FinalVar  //final class cannot access extends
{
	final int x =100;
	final void show()
	{
		System.out.println("This is final method");
	}
}

class FinalMethod extends FinalVar
{
	int p;
	void disp()
	{
		System.out.println("This is normal method");
	}
}
public class final_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalMethod f = new FinalMethod();
		f.disp();
		f.show();
		
		finalDemo d = new finalDemo();
		d.display();
		

	}

}
