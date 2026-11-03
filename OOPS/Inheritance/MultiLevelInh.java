package Inheritance;
class Balance{
	
	public int getbalance(int balance) {
		return balance;
	}
	
}

class CheckBalance extends Balance {
	
	public void validate(int balance[], String name[] , String AccID[]) {
		
		for (int i = 0; i < name.length; i++) {
			if(name[i].equals("ABC")&&AccID[i].equals("101")) {
				System.out.println(getbalance(balance[i]));
				return;
			}
		}
		
		System.err.println("No account has been found");
	}
	
}

class atm extends CheckBalance{
	
}

class finCheckApp extends CheckBalance {
	
}

public class MultiLevelInh {

	public static void main(String[] args) {

		String AccID[] = {"101", "102", "103"};
		String name[] = {"ABC", "DEF", "GHI"};
		int[] balance = {1000, 2000, 100};
//		atm a = new atm();
//		a.validate(balance, name, AccID);
		
		finCheckApp app = new finCheckApp();
		app.validate(balance, name, AccID);
	}
	
}
		
