package LoopStatement;

public class ForLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			if (i==6) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("6 is not available");
	}

}
