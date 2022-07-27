package java1;

public class overloading2 {
	void add (int a, int b)
	{
		System.out.println("int parameter"+" "+(a+b));
	}
	void add (float a, float b)
	{
		System.out.println("float parameter"+" "+(a+b));
	}
	void add (String a, String b)
	{
		System.out.println("String parameter"+" "+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading2 o = new overloading2();
		o.add(12, 10);
		o.add(1231f, 1219f);
		o.add("Adarsh", "Pingale");
		

	}

}
