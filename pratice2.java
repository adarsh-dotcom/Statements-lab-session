import java.util.*;
class pratice2
{
public static void main(String args[])
{

int age1, age2, age3;
Scanner sc = new Scanner(System.in);

System.out.println("Enter the first age");
age1 = sc.nextInt();

System.out.println("Enter the Second age");
age2 = sc.nextInt();

System.out.println("Enter the Third age");
age3 = sc.nextInt();

if(age1>age2 && age1>age3)
{
System.out.println("age 1 is older person");
}

if (age2>age1 && age2>age3)
{
System.out.println("age 2 is older person");
}

else
{
System.out.println("age 3 is older person");
}

sc.close ();

}
}
 
