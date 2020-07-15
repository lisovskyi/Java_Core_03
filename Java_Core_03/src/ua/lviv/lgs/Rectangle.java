package ua.lviv.lgs;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle() {
		width = 5;
		length = 10;
		
	}
	public Rectangle(double width, double length) {
		if (width > 0 && length > 0) {
			this.width = width;
			this.length = length;
		} else {
			System.out.println("Ви ввели від'ємне значення однієї із сторін");
		}
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {		
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public void showMeSquare() {
		System.out.println("Площа прямокутника = " + this.length * this.width);
	}
	public void ShowMePerimetr() {
		System.out.println("Периметр прямокутника = " + (this.length + this.width) * 2);
	}
}
