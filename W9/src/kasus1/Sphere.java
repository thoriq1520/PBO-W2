package kasus1;

public class Sphere extends Shape{
	private double radius;
	
	//sets up the sphere
	
	public Sphere(double r) {
		super("Sphere");
		radius = r;
	}
	
	//returns the surface area of the sphere
	
	public double area() {
		return 4*Math.PI*radius*radius;
	}
	
	//returns the sphere as a String
	
	public String toString() {
		return super.toString() + " of radius " + radius;
	}
}