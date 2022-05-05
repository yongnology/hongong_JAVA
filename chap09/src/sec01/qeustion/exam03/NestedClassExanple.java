package sec01.qeustion.exam03;

public class NestedClassExanple {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire(); 
				
		Car.Engin engine = new Car.Engin();
	}
}
