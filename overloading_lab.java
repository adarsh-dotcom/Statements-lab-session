package java1;

public class overloading_lab {
	
	void add(int a,int b)
	{
		System.out.println(" 2 Parameter "+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println(" 3 Parameter "+(a+b+c));
	}
	void add(int a,int b,int c,int d)
	{
		System.out.println(" 4 Parameter "+(a+b+c+d));
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	overloading_lab t =new overloading_lab();
	t.add(12, 23);
	t.add(45, 78, 2, 7);
	t.add(45, 32, 4);

		}

	}


