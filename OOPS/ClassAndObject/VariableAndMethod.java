package ClassAndObject;

public class VariableAndMethod {
	
//	Access-specifier returntype methodName() {}
	int b = 1000; // global or class
	
	// normmal method
	public void add ()
	{
		int a = 10, b = 20;
		System.out.println(a+b);
	}
	
	//parameterization
	public void sub(
	int a,  int b) {
	System.out.println(a-b);	
	}
	
	        public int multi(
			int a)  {int b = 40; //local variable
			return a*b;
	        }
	        
	        public void div() {
	        	System.out.println(b);
	        }
	
	public static void main(String[] args) {
	VariableAndMethod va = new VariableAndMethod();
	va.add();
	va.add();
	va.sub(10,5);
	va.sub(60,90);
	
	System.out.println(va.multi(60));
	String hello = "Hello gus";
	System.out.println(hello.length());
	}
	
	

			}
