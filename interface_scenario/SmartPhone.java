package interface_scenario;

import java.util.Date;

public class SmartPhone implements Camera,Clock,MusicPlayer,Phone{
	
	String modelname;
	int ram;
	double price;

	public SmartPhone(String modelname, int ram, double price) {
		super();
		this.modelname = modelname;
		this.ram = ram;
		this.price = price;
	}

	@Override
	public void call() {
		System.out.println("Dial number and Call");
		
	}

	@Override
	public void sms() {
		System.out.println("Send short messeges when call not possible");
		
	}

	@Override
	public void listenMusic() {
		System.out.println("Play KK's song in loop");
		
	}

	@Override
	public void checkTime() {
		System.out.println(new Date());
		
	}

	@Override
	public void capture() {
		// TODO Auto-generated method stub
		
	}

}
