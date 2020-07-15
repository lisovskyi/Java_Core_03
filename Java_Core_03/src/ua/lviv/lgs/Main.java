package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(4, 8);
		Rectangle rec3 = new Rectangle(-5, 8);
		
		Circle circle1 = new Circle(8.45);
		
		circle1.showMeCircumference();
		circle1.showMeSquare();
		
		rec1.setLength(9);
		rec1.showMeSquare();
		rec2.ShowMePerimetr();
	}

}
