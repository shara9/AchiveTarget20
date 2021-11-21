import java.util.Scanner;
public class GuessGame {
		static int guess;
		static Scanner scr=new Scanner(System.in);
		public static void main(String[] args) {
			for(int i=1;i<=3;i++)
			{
			System.out.println("enter your guess- ");
			guess=scr.nextInt();
			
			}
			if(guess==9)
					System.out.println("guess 9 \nyou guessed it right");
			else
					System.out.println("sorry! you failed");
			
			}
	}

