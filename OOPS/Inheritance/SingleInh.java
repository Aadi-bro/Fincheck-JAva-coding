package Inheritance;

import java.util.Scanner;

class AmountCalc{
	public void deposit(int amount, int balance) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Amount has been deposited \nYour current balance is : " +balance);
		} else {
			System.out.println("Invalid amount entered!!!!");
		}
	}
}
          class ATM extends AmountCalc{
        	  
          }

public class SingleInh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your deposit amount");
		int amount = sc.nextInt();
		ATM a = new ATM();
		a.deposit(amount, 1000);

	}

}
