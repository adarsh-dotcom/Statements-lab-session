import java.util.*;
class Pratice6
{
public static void main(String args [])
{
int a,b,x;
Scanner sc = new Scanner(System.in);

System.out.println("Enter 1st Number");
a=sc.nextInt();

System.out.println("Enter 2nd Number");
b=sc.nextInt();

System.out.println("Enter the choice");
x=sc.nextInt();

switch(x)
{

case 1 : 
System.out.println(a + b);
break;

case 2 : 
System.out.println(a - b);
break;

} 
}
}
