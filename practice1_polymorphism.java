package polymorphism;
class Animal
{
	String colour="White";
}
class Dog extends Animal
{
	String colour="Black";
	void printColour()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}
}

public class practice1_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.printColour();

	}

}
