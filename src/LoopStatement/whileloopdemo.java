package LoopStatement;

public class whileloopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  messages = {
	            "Transaction successful: INR 1,500 credited",
	            "Transaction failed: Insufficient balance",
	            "Transaction pending: Awaiting bank approval",
	            "Transaction successful: INR 4,200 debited"
	        };
		int i = 0;
		  while (i < messages.length) {
			  System.out.println(messages[i]);
			  i++;
		  }
	}

}
