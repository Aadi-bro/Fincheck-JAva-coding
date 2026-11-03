package LoopStatement;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int balance = 10000000;
		int atm = 1000;
		int withdrawal = 0;
		int deposit;
	
			System.out.println("Enter your card number : ");
			long cn = sc.nextLong();
			
			if(cn == 1111222233334444L){
				boolean pinAuthenticated = false;
				for(int i = 1; i <= 3; i++) {
					System.out.println("Enter your pin");
					int pin = sc.nextInt();
					if (pin ==1234) {
						pinAuthenticated = true;
						break;
					} else {
						System.out.println("Incorrect Pin");
						}	
				}
				
				if(pinAuthenticated) {
					boolean exit = false;
					while (!exit && balance > 0) {
						System.out.println("Menus\n1.deposit\n2.without\n3.check balance\n4.exit");
						System.out.print("Choose an option");
						int menu = sc.nextInt();
						
						switch(menu) {
						case 1:
						System.out.println("Enter your deposit amount");
						int amount = sc.nextInt();
						deposit = amount ;
						}
					}
				}
				
			}
		}
	}

}
