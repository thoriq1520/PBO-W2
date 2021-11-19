package kasus1;

public class Cylinder extends Shape{
	private double radius, height;
	
	public Cylinder(double r, double h) {
		super("Cylinder");
		radius = r;
		height = h;
	}
	
	public double area() {
		return Math.PI*Math.sqrt(radius)*height;
	}
	
	public String toString() {
		return super.toString() + " of radius " + radius + " and height " + height;
	}
}
