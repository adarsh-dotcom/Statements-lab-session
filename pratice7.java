class pratice7
{
public static void main(String args[])
{
int s = 0, c = 0;

for(int i = 1; i<=50; i++)
{

if(i%2==0)
{
System.out.println(i);
s = s+i;
c = c+1;
}
}
System.out.println("sum of al even no" +s);
System.out.println("average of all even no" +(double)s/c);

}
}
