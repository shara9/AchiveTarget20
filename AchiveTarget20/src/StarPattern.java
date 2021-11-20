

public class StarPattern {

	public static void main(String[] args) {
		
		
		for(int i=5;i>=0;i--) 
		{
			for(int k=i;k>=1;k--) 
			{	
				System.out.print(" ");
			}
				
			for(int j=i-1;j<5;j++) 
				{
					System.out.print("* ");
				}
		System.out.println();
		}
}
}
