
public class SnackLaddar {	
		public static void main(String[] args) {
			int startPostion = 0;
			//int winningPostion = 100;
			int diescount=0;
			int die = 1 + (int) (Math.random() * 6);
			System.out.println("die number is- " + die);
			
			if (die == 6) 
			{
				startPostion += 1;
				System.out.println("now ur game is start- " + startPostion);
				
				//for (int i = startPostion; i <= winningPostion; i++)
				do
				{
					int dies = 1 + (int) (Math.random() * 6);
					System.out.println("dies is " +dies);
					
					if (startPostion == 4||startPostion==8||startPostion==21||startPostion==28||startPostion==50||startPostion==71||startPostion==88) 
					{
						startPostion+=5;
						System.out.println("ladder");
						System.out.println("ur position is-" +startPostion);
					}
					else if(startPostion==32||startPostion==34||startPostion==48||startPostion==63||startPostion==88||startPostion==95||startPostion==99)
					{
						startPostion-=8;
						System.out.println("snake");
						System.out.println("ur position is-" +startPostion);
					}
					else if(startPostion>=1||startPostion<=100)
					{
						startPostion+=dies;
						System.out.println("ur position is-" +startPostion);
					}
					else if(startPostion==100) {
					System.out.println("game over");}
					
					diescount++;
					} while(startPostion<=100);
				
				System.out.println("tottal die count is- "+diescount);			
			} else
				System.out.println("TRY AGAIN you want 6 to start ur game");

		}
	}
