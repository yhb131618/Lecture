package chap07_class;

import chap07_class.circle.Circle;

public class _03_UserOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 12;
		
		// Circle 부품
		Circle circle = new Circle(radius);
		System.out.println(circle.radius);
		System.out.println("원의 둘레: " + circle.round());
		System.out.println("원의 넓이: " + circle.area());
	}

}
