
public class Point {
	
	// Fields
	private double x;
	private double y;
	
	// Method
	
	public String toString() {
		return "(" + getX()+ ", " + getY() + ")" ;
	}
	
	public double distance() {
		
		return Math.sqrt(x*x+y*y);
	}

	public double distance(Point p) {
		return Math.sqrt( (this.x-p.getX())*(this.x-p.getX()) +
				(this.y-p.getX()) * (this.x-p.getX()) );
	}
	
	
	

	public void print( ) {
	// System.out.println("(" + pnt.getX()+ ", " + pnt.getY() + ")");
	// System.out.println("(" + this.x+ ", " + this.y + ")");
	System.out.println("(" + getX()+ ", " + getY() + ")");
	}


	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
}
