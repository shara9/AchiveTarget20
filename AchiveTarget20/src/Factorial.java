import java.util.Scanner;
public class Factorial {
static Scanner scr=new Scanner(System.in);
	public static void main(String[] args) {
			System.out.println("enter number for check factorial- ");
				int a=scr.nextInt();
				int sum=1;
				for(int i=a;i>=1;i--) 
				{
					 sum=sum*i;
					 System.out.println(sum);
					 }		
			}
	}
