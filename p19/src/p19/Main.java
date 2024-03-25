package p19;

class Shape {
	public double radius;
	public double height,width;
	public double side1,side2,side3;
	
	
	
	public double area() {
		return 0;
	}
	
	public double perimeter() {
		return 0;
	}
	
}

class Circle extends Shape{

public Circle(double radius) {
	this.radius = radius;
}

public double area() {
	return Math.PI * radius * radius;
}

public double perimeter() {
	return 2 * Math.PI * radius;
}
}

class Rectangle extends Shape{
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
}

class Triangle extends Shape{
	
	public Triangle(double side1,double side2,double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double area() {
		double s = 0.5*(side1 + side2 + side3);
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double perimeter() {
		return side1 + side2 + side3;
	}
}
public class Main {
	
	public static void main(String args[]) {
		Circle c = new Circle(6);
		System.out.println("Area of circle: "+c.area());
		System.out.println("Perimeter of circle: "+c.perimeter());
		
		Rectangle r = new Rectangle(3,6);
		System.out.println("Area of rectangle: "+r.area());
		System.out.println("Perimeter of rectangle: "+r.perimeter());
		
		Triangle t = new Triangle(3,4,5);
		System.out.println("Area of triangle: "+t.area());
		System.out.println("Perimeter of triangle: "+t.perimeter());
	}

}
