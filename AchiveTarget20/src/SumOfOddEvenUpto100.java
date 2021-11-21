
public class SumOfOddEvenUpto100 {
		public static void main(String[] args) {
			int even=0;
			int odd=0;
			for(int i=1;i<=100;i++)
			{
				if(i%2==0)
					even=even+i;
				else
					odd=odd+i;
			}
			System.out.println("total even number of sum between 1 to 100 is- " +even);
			System.out.println("total odd number of sum between 1 to 100 is- " +odd);
		}
}
