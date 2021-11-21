
import java.util.Scanner;
public class MagicWord 
{
	static Scanner scr=new Scanner(System.in);
	     public static void main(String []args)
	     {
	    	 System.out.println("enter any digit of number to see magic- ");//output is every single digit's sum 
	         int a=scr.nextInt();
	         int d=a;
	         int c=0;
	         int b;
	         
	         for(int i=1;i<=a;i++)
	         {
	             
	             b=d%10;
	             d=d/10;
	             c=c+b;
	              
	         }
	         System.out.println(c);
	         }
	    
	     }
	


