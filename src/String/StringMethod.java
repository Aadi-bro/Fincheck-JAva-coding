package String;

public class StringMethod {

	public static void main(String[] args) {

		String str = "Aditya";
		
		System.out.println(str.length());
		//////////////////////////////////
		System.out.println(str.charAt(0));
		//////////////////////////////////
		System.out.println(str.toUpperCase());
		////////////////////////////////////////
		System.out.println(str.toLowerCase());
		//////////////////////////////////////
		String str2 = new String("Aditya");
		
		if (str.equals(str2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are equal");
		}
		    if (str.equalsIgnoreCase(str2)) {
		    	System.out.println("Both are equal");
		    } else {
		    	System.out.println("Both are not equal");
		    }
		    
		    if (str.contains("At")) {
		    	System.out.println("It is contain");
		    } else {
		    	System.out.println("It is not contain");
		    }
		    
	
	}

}
