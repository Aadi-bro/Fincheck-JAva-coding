package ConditionalStatement;

import java.util.Scanner; 

public class CardNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Car No.: ");
		Long (cn=111122223333) {
			System.out.println("Enter your pin : ");
			int pin = sc.nextInt();
			
			if (pin==1234) {
				System.out.println("Transaction successful");
			} else {
				System.out.println("pin incorrect");
			}
		} else {
			System.out.println("card not fount");
		}
	}

}
