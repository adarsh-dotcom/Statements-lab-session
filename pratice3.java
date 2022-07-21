import java.util.*;
class pratice3
{
public static void main(String args[])
{

int exp;
double salary=10000;
Scanner sc = new Scanner(System.in);

System.out.println("Enter the experiance");
exp = sc.nextInt();


if(exp>=5)
{
salary=salary+(0.05*salary);
System.out.println("employee eligible for increment=" +salary);
}
else
{
System.out.println("employee is not eligible for increment");
}

sc.close();
}
}

