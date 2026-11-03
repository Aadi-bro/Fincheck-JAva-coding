package ConditionalStatement;

import java.util.Scanner;

public class Validateaccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. Prompt and read the user's input
		System.out.println("Enter Your Card Number :");
		String cardNumber = sc.nextLine(); 
		
		// 2. Define the account status variable (fixed typo to "Active")
		String accountStatus = "Active";
		
		// 3. Validate using equals()
		if (accountStatus.equals("Active")) {
			System.out.println("Account is Active");
		} else {
			System.out.println("Account is not Active");
		}
		
		// Close the scanner to prevent resource leaks
		sc.close(); 
	}
}



