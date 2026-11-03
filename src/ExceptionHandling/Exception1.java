package ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println("everyone");
			System.out.println(name.toUpperCase());
		}  finally {
			System.out.println("h1");
		}
		System.out.println("demo");
	}

}
