package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class AccountDetails {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\aadit\\Downloads\\Customers Details.csv");
		Scanner sc = new Scanner(f);
		sc.nextLine();
		while (sc.hasNextLine()) {
			String[] data = sc.nextLine().split(",");
			
			integer i = Integer.parseInt(data[1]);
			
			if(i>0) {
				System.out.println(data[0]+"transaction can be perfom able");
			} else {
				System.out.println(data[0]+"transaction can't be perform able");
			}
		}
	}

}
