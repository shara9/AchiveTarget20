
public class Recursion {
		static int number=1;
		public static void main(String[] args) {
		
			if(number<=100)
			{
				System.out.println(number++);
				main(null);
			}
		}
	}

