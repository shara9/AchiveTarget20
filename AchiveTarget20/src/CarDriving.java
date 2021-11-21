import java.util.Scanner;
public class CarDriving {
		static Scanner s = new Scanner(System.in);
		static int choice;
		public static void main(String[] args) {
			int temp = 0;
			do {
				System.out.println("hello how can i help you\n1-start \n2-stop \n3-quit \n\nEnter your choice-");
				choice = s.nextInt();
				switch (choice) {
				case 1:
					if (temp == 0) {
						System.out.println("Car Start");
						temp++;
						break;
					} else {
						System.out.println("Car already started");
						break;
					}
				case 2:
					if(temp==1)
					{
						System.out.println("Car stop");
					temp--;
					break;
					}
					else
					{
						System.out.println("car already stop");
					break;
					}
				default:
					System.out.println("sorry i dont understand-- quit");
					break;
				}
			} while (choice < 3||choice!=1);
		}
	}
