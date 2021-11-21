import java.util.Scanner;
public class EvenOdd {
		static Scanner scr=new Scanner(System.in);
		public static void main(String[] arg)
		{
			System.out.println("enter your number to check for even or odd- ");
			int number=scr.nextInt();
			if (number%2==0) 
				System.out.println("your number is even");
			else
				System.out.println("your number is odd");
		}
	}
