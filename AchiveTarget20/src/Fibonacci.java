
public class Fibonacci {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=0;
		for(int i=1;i<=5;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);

		}
		
	}

}
