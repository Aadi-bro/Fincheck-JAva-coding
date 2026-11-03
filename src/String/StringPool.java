package String;

import java.util.Scanner;

public class StringPool {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a token");
		String token = sc.next();
		
		String str = "Hello ji";
		String str2 = "Hello ji";
		
		String str3 = new String("Hello");
		
		System.out.println(str3);
		
		if (str==token) {
			System.out.println("Both are same pool");
		} else {
			System.out.println("Both are not from same pool");
		}
		
	}

}
