import java.util.*;
class pratice4
{
public static void main(String args[])
{

int a,b,c;
Scanner sc=new Scanner(System.in);

System.out.println("Enter first side");
a=sc.nextInt();
System.out.println("Enter 2nd side");
b=sc.nextInt();
System.out.println("Enter 3rd side");
c=sc.nextInt();

if(a == b && b == c)
{
System.out.println("it is eqilateral traingle");
}
else if(a == b || b == c || a == c) 
{
System.out.println("it is isoscales traingle");
}
else
{
System.out.println("it is Scalene traingle");
}
sc.close();

}
}