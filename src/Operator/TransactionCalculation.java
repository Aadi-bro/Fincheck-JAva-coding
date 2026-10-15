package Operator;

public class TransactionCalculation {
	public static void main(String[] args) {
		int balance = 50000;
		int Amount = 45000;
		//balance = 50000-45000
		// balance = 5000
		balance = balance - Amount;
		System.out.println("Anil kumar current balance is" + balance);
		int incentives = 5000;
		balance = balance + incentives;
		System.out.println("anil kumar current update balance is"  +balance);
		
	}

}
