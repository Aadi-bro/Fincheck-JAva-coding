package polymorpism;

class Vehicle {

	public void speed() {
		System.out.println("this code belongs to Vehicle");
	}
	
	class Car extends Vehicle{
		public void speed() {
			System.out.println("this code beongs to car");
		}
	}
	
	class Bike extends Vehicle{
		public void speed() {
			System.out.println("this code belongs to Bikr");
		}
	}
	
	public class MethodOveriding{
		public static void main(String[] args) {
			
			Car c = new Car();
			
			c.speed();
		}
}
}