package Interface;
interface showable1
{
	int x=123;
	void disp();
	void show();
}
interface printable
{
	String p="hello java";
	void disp();
}
class Test implements printable, showable1
{
	public void disp()
	{
		System.out.println("This is Multiple inheritance example");
		System.out.println(p+"  "+x);
	}
	public void show()
	{
		System.out.println("Hello method 2");
	}
}

public class multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.disp();
		t.show();

	}

}
