package userinput;

import java.util.Scanner;

public class takevaluefromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your withdrawal amount");
		int amount = sc.nextInt();
		
		System.out.println("user withdrawal amount is "+amount);

	}

}
