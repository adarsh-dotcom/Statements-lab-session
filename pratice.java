import java.util.*;
class pratice
{
public static void main(String args[])
{
int average;
Scanner sc = new Scanner(System.in);

System.out.println("Enter average of your marks");
average = sc.nextInt();

if (average>=0 && average<=34)
{
System.out.println("Fail");
}

else if (average>=35 && average<=65)
{
System.out.println("Grade b");
}

else if (average>=66 && average<=75)
{
System.out.println("Grade a");
}

else if(average>=76 && average<=95)
{
System.out.println("Grade A+");
}

else
{
System.out.println("Grade o");
}


sc.close();
}
}

