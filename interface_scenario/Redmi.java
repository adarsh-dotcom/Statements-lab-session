package interface_scenario;

public class Redmi extends SmartPhone {

	public Redmi(String modelname, int ram, double price) {
		super(modelname, ram, price);
		System.out.println("Redmi [modelname=" + modelname + ", ram=" + ram + ", price=" + price + "]");
	}

	

	void redmiFeature()
	{
		System.out.println("Touch facility is of another level");
	}
	
}
