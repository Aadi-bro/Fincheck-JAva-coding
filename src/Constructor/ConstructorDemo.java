


package Constructor;

public class ConstructorDemo {

    // Default constructor
    public ConstructorDemo() {
        System.out.println("Hello");
    }

    // Parameterized constructor
    public ConstructorDemo(String Name) {
        System.out.println("Name of the person is " + Name);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ConstructorDemo c = new ConstructorDemo("Aditya");
        System.out.println(c.add(15, 50));
        System.out.println(c.add(80, 90));
        System.out.println(c);
        System.out.println(c);
    }
}
