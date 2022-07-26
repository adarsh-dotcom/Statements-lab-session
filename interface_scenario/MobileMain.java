package interface_scenario;

public class MobileMain {
	
	private static void call() {
		SmartPhone s1 = new SmartPhoneFactory().getSmartPhone();
		
		if (s1 !=  null)
		{
			s1.call();
			s1.capture();
			s1.checkTime();
			s1.sms();
			s1.listenMusic();
			
			if(s1 instanceof Redmi)
			{
				((Redmi) s1).redmiFeature();
			}
			
			else if(s1 instanceof Samsung)
			{
				((Samsung) s1).samsungFeatures();
			}
		}
		
		else
		{
			System.out.println("Item not available !!");
		}
	}
	

	public static void main(String[] args) {
		call();

	}

	

}
