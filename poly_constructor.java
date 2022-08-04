package polymorphism;


class Demo{
	void show()
	{
		System.out.println("This is Paraent class show method");
	}
}
class Demo1 extends Demo{
	void show()
	{
		System.out.println("This is child class show method");
		super.show();
	}
}
public class poly_constructor {

	public static void main(String[] args) {

	
		// TODO Auto-generated method stub
Demo1 d = new Demo1();
d.show();
	}

}


