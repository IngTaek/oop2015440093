
public class Car {
	
	// Fields
	private String color;
	private int speed;
	
	
	public static int numberofCars = 0;    // ���� ����, static field
	
	
	// Constructor (������) : �޼ҵ���� Ŭ�� �̸��� ����. ��ȯ���� ����.
	public Car(String color, int speed) {
		this.color = color;    // this.color �� �ʵ��� color, color �� �Ű������� color
		this.speed = speed;
		
		numberofCars++;
	}
	
	public Car() {
		this.color = "White";
		this.speed = 60;
		
		numberofCars++;
	}
	
	// Methods
	
	// ���� �޼ҵ忡���� ���� �������� ������ �� �ִ�
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
