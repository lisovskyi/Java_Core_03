package ua.lviv.lgs;

public class Circle {
private double radius;
private double diameter;

public Circle() {
	diameter = radius * 2;
	System.out.println("Default constructor");
};

public Circle(double radius){	
	this.radius = radius;
	diameter = radius * 2;
}

public void showMeSquare(){
	System.out.println("Площа кола з діаметром " + diameter + " = " + Math.PI * Math.pow(diameter/2 , 2));
}

public void showMeCircumference(){
	System.out.println("Довжина кола з радіусом " + radius + " = " + 2*Math.PI * radius);
}
}
