
public class TestCar {

	public static void main(String[] args) {
		
		System.out.println(Math.cos(0));

		Car myCar = new Car("Space Blue", 300);
		System.out.println(myCar.numberofCars);
		Car yourCar = new Car();     
		System.out.println(Car.numberofCars);
		
		
//		myCar.setColor("Black");
//		myCar.setSpeed(100);
		
		System.out.println(myCar);
		System.out.println(yourCar);
		
	}

}
