import java.util.Scanner;
public class Characters_inString {
	static Scanner scr=new Scanner(System.in);
	
	    public static void main (String[] args) {    
	    	System.out.println("enter your String- ");
	        String string =scr.nextLine();   
	        int count = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i) != ' ')    
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);    
	    }    
	}     


