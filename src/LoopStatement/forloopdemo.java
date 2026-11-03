package LoopStatement;

public class forloopdemo {

	public static void main(String[] args) {
		int[] transactionAmount  = {1000, 2000, 3000, 4000, 5000, 6000};
		int validTransactionCount = 0;
		for (int i = 0; i < transactionAmount.length; i++) {
			if (transactionAmount[i] > 0 ) {
				validTransactionCount++;
			}
		}
		System.out.println("Total valid Transaction: " +validTransactionCount);
	}

}
