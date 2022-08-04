package polymorphism;
class shape
{
	String colour;
	shape(String c)
	{
		colour = c;
		System.out.println("colour of shape is :");
	}
}

class circle extends shape
{
	float radius;
	circle(float radius, String colour)
	{
		super(colour);
		this.radius = radius;
	}
	void area()
	{
		System.out.println("Area of circle is :"+ (3.14*radius*radius));
	}
}
public class Constructor11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle(2.5f,"Blue");
		c.area();

	}

}
