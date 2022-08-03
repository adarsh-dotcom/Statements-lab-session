package polymorphism;
class Vehicle
{
void run()
{
	System.out.println("Vehicle is running");
}
}

class Bike2 extends Vehicle
{
	void run()
	{
		System.out.println("Bike is running saftely");
	}
}
class Car2 extends Vehicle
{
	void run()
	{
		System.out.println("Car is running sagtely and Fast");
	}
}

public class practice_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v;
		v = new Bike2();
		v.run();
		
		v = new Car2();
		v.run();

	}

}
