
package ConditionalStatement;

import java.util.Scanner;

public class calculationandvaluefromuser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("Enter your withdrawal amount:");
        int withdraw = sc.nextInt();

        System.out.println("User withdrawal amount is " + withdraw);

        if (balance >= withdraw) {
            System.out.println("Transaction Successful");
            balance = balance - withdraw;
            System.out.println("Remaining balance is " + balance);
        } else {
            System.out.println("Transaction Failed !!!!!");
            System.out.println("Transaction amount is greater than your balance");
            System.out.println("Available balance is " + balance);
        }

    }
}
