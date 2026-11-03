package Arrays;
import java.util.Arrays;
public class Marks {

	public static void main(String[] args) {

				int Ajay_hindi = 78;
				int Ajay_English = 80;
				int Ajay_Marathi = 90;
				
				int[] Ajay_marks = {78, 80, 90, 70};
				
				// Ajay_marks = 65;
				
				Arrays.sort(Ajay_marks);
				String src = Arrays.toString(Ajay_marks);
				System.out.println(Ajay_marks[3]);
				
				int[] arr = new int [3];
				arr[0] = 1; 
				arr[1] = 2;
				arr[2] = 3;
				
				int a[][] = {
						{5,10,15,20},
						{10,20,30,40}

		};
				
				System.out.println(a[0][0]);
				
				for (int i = 0; i <= 3; i++)
				for( int j = 0; j <=1; j++){
					System.out.println(a[j][i]);
				}

	}

}
