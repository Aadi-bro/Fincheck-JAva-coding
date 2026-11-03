package Arrays;

public class SumOfMarks {

	public static void main(String[] args) {

		String name[] = {"Aditya", "Sheru", "Motu", "Patlu"};
		
		int marks [][] = {
				{76,70,60,82,71},
rfd4				{80,70,50,99,46},
				{70,81,76,69,85},
				{72,57,92,12,34}
		
		};
		
		for(int i = 0; i <= 3; i++) {
			int sum = 0;
			for (int j = 0; j <= 4; j++) {
				sum = sum + marks [j] [i];
			}
			System.out.println(name[i]+"total marks is" +sum+" /500");
			System.out.println(name[i]+"percentage is"+((double)sum/5));
		}
	}
}
