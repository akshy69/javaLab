

abstract class Shape {
	abstract void noOfSides();
}
class Rectangle extends Shape{
	void noOfSides() {
		System.out.println("rectangle has 4 sides");
	}
}
class Triangle extends Shape{
	void noOfSides() {
		System.out.println("Triangle has 3 sides");
	}
}
class Hexagon extends Shape{
	void noOfSides() {
		System.out.println("Hexagon has 6 sides");
	}
}

class mainPrint{
	public static void main(String arr[]) {
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Hexagon h=new Hexagon();
		
		r.noOfSides();
		t.noOfSides();
		h.noOfSides();
		
	}
	
}
