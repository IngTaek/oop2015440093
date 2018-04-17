
public class Car {
	
	// Fields
	private String color;
	private int speed;
	
	
	public static int numberofCars = 0;    // 정적 변수, static field
	
	
	// Constructor (생성자) : 메소드명이 클라스 이름과 같다. 반환형이 없다.
	public Car(String color, int speed) {
		this.color = color;    // this.color 는 필드의 color, color 는 매개변수의 color
		this.speed = speed;
		
		numberofCars++;
	}
	
	public Car() {
		this.color = "White";
		this.speed = 60;
		
		numberofCars++;
	}
	
	// Methods
	
	// 정적 메소드에서는 정적 변수에만 접근할 수 있다
	// public static void print() {
	//	System.out.println(this.color + "," + this.speed);
	// }
	 public static void print() {
		 System.out.println(numberofCars);
	 }
	
	
	 public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String toString() {
		return ("Color is " + this.color + ". Speed is " + this.speed);
	}
	


	


}
