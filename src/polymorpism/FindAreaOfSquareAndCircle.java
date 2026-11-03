package polymorpism;

abstract class Shape{
	public abstract void area(double area);
}
     
class Square extends Shape{
	@Override
	public void area(double area) {
		System.out.println("Area of square is "+ area*area);
	}
}

class Circle extends Shape{
	@Override
	public void area(double area) {
		System.out.println("Area of Circle is"+ 3.14*area*area);
	}
}

public class FindAreaOfSquareAndCircle {
	public static void main(String[] args) {
		Shape s = new Circle ();
		s.area(3);
	}

}
