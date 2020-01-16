
public abstract class Shape {
	private String name;
	public Shape(String n){name = n;}
	public abstract double area();
	public abstract double perimeter();
	public void put() {
		System.out.printf(
			"%s with area %6.2f and perimeter %6.2f\n",name,area(),perimeter() 
		);
	}
}

class Pentagon extends Shape {
	private double sideLength;
	private double height;
	public Pentagon(String n, double l, double h){
		super(n);
		sideLength = l;
		height = h;
	}
	public double area(){
		return 2.5*sideLength*height;
	}
	public double perimeter(){
		return sideLength*5;
	}
}

class Circle extends Shape {
	private double radius;
	private double pi = Math.PI;
	
	public Circle(String n, double r){
		super(n);
		radius = r;
	}
	public double area(){
		// A = pi*(r^2)
		return pi * Math.pow(radius, 2);
	}
	public double perimeter() {
		return 2*pi*radius;
	}
	public double diameter() {
		return 2*radius;
	}
}

class TestShape {
	public static void main(String[] args) {
		
		// Pentagon test
		double sideLength = 5; double height = 6;
		Shape Pentagon = new Pentagon("Pentagon",sideLength,height);
		Pentagon.put();
		
		// Circle test
		double radius = 5;
		Shape Circle = new Circle("Circle",radius);
		Circle.put();
	}
}