package kasus1;

abstract class Shape {
	private String shapeName;
	
	public Shape(String name){
		shapeName = name;
	}
	
	public abstract double area();
	public String toString() {
		return "name of shape " + shapeName;
	}
}
