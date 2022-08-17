package Interface;
interface newversion
{
	default void show()
	{
		System.out.println("This is defauat method in interface");
	}
	static void display()
	{
		System.out.println("This is static method in interface");
	}
	void putinfo();
}
class Demo12 implements newversion
{
	public void putinfo()
	{
		
		System.out.println("This is abstract method in interface");
	}
}
public class interfacenew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newversion.display();
		Demo12 dd = new Demo12();
		dd.putinfo();
		dd.show();

	}

}
