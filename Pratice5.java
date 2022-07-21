import java.util.*;
class Pratice5
{
public static void main(String args [])
{
int a,b,c;
Scanner sc = new Scanner(System.in);

System.out.println("Enter 1st side");
a=sc.nextInt();

System.out.println("Enter 2nd side");
b=sc.nextInt();

System.out.println("Enter 3rd side");
c=sc.nextInt();

if(a==b && b==c)
{
System.out.println("it is equilateral traingle");
}
else if (a==b || b==c || a==c)
{
System.out.println("Isoceles traingle");
}
else
{
System.out.println("Scalene traingale");
}
sc.close();
}
}


