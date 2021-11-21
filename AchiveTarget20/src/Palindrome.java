import java.util.Scanner;
public class Palindrome {
	static Scanner scr=new Scanner(System.in);
		 public static void main(String args[]){  
			 System.out.println("enter your number for check- ");
		  int r,sum=0,temp;    
		  int n=scr.nextInt();//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("this number is palindrome number ");    
		  else    
		   System.out.println( "this number is not palindrome");    
		}  
		}  


