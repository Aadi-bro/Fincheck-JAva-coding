package ConditionalStatement;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Card Number :");
		long cn = sc.nextLong();
		if (cn==1111222233334444L) {
			System.out.println("Enter your pin : ");
			int pin = sc.nextInt();
			if (pin==1234) {
				int balance = 100000000 ;
				System.out.println("Menus \n1.deposit\n2.withdrawal\n3.check balance\n4.exit");
				int menu = sc.nextInt();
			
				switch (menu) {
				case 1 :
					System.out.println("ENter your deposit amuont");
					int amount = sc.nextInt();
					if (amount > 0) {
						balance = balance + amount;
						System.out.println("Your current update balance is "+balance);
					} else {
						System.out.println("invalid deposit amount");
					}
					break;
				case 2:
					System.out.println("Enter your withdrawal amount :");
					amount = sc.nextInt();
					if (amount > 0) {
						balance = balance - amount ; 
						System.out.println("your current update balance is "+balance);
					} else {
						System.out.println("invalid withdraw amount");
					}
					break;
					default:
						System.out.println("invalid menus option has been typed");
						break;
			    }
			} else {
				System.err.println("incorrent pin");
			}
		} else {
			System.out.println("your card not found");
		}
		
		
		
	}

}
