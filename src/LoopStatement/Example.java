package LoopStatement;

public class Example {

	public static void main(String[] args) {
		String[] transactionID = {"TXN1", "TXN2", "TXN3", "TXN4"};
		
		double[] transactionAmount = {200, -100,-.015, 150.85};
		
		System.out.println("Transaction Validation Processing");
		
		for (int i = 0; i < transactionID.length; i++) {
			String currentID = transactionID[i];
			double currentAmount = transactionAmount[i]; 
			System.out.print("Transaction ID: " + currentID + "| Amount: " + currentAmount + " -> Status: " );
			if(currentAmount > 0)  {
				System.out.println("Valid");
			} else {System.out.println("Invalid");
			}
			}
		System.out.println("Validation Processing Complete");
			
		}

}
