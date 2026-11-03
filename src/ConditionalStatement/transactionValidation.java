package ConditionalStatement;

public class transactionValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance = 5000;
		int withdraw = 40000;
		
		if (balance > withdraw) {
			System.out.println("Transaction Successful");
		} else { 
			System.out.println("Transaction Failled !!!!! \n Transaction amount is greater then your balance");
			
		}

		
		
		
	}

}
