
public class Point {
	
	// 필드 변수
	// 필드의 scope(유효범위)는 클래스 내부이다.
	public double x;   
	public double y;
	
	
	public double distance() {
		
		// 반환활 변수 선언
		double result;    // 지역변수의 scope는 메소드 내부이다.
		
		// 거리 계산
		result = Math.sqrt(x*x+y*y);    // 
		
		// 거리 반환
		return result;	
	}
	
	public Point move(Point p) {   // 매개변수 p의 scope는 메소드 내부이다.
		
		// temp 변수 선언
		double a;
		double b;
		
		// 포인트 p 만큼 이동
		a = this.x + p.x;
		b = this.y + p.y;
		 
		// 새로운 포인트 생성
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		// 새로운 포인트 반환
		return pnt;
	}
	
	

}
