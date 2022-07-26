package interface_scenario;

public class Samsung extends SmartPhone{
	
	public Samsung(String modelname, int ram, double price) {
		super(modelname, ram, price);
		System.out.println("Samsung [modelname=" + modelname + ", ram=" + ram + ", price=" + price + "]");
	}

	void samsungFeatures() 
	{
		System.out.println("Low maintainance than any other brand ");
	}

}
