package chap07_class.circle;

public class Circle {
	// 1. 상수 double PI 3.14 선언
	public final double PI = 3.14;
	
	// 2. 반지름 int radius
	public int radius;
	
	// 3. 기본생성자 1개와 radius를 받아서 초기화하는 생성자 1개
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// 4. 원의 둘레를 계산해서 double형으로 리턴하는 메소드 한개(2 * PI * radius)
	// 매개변수 없이
	public double round() {
		return 2 * PI * radius;
	}
	
	// 5. 원의 넓이를 계산해서 double형으로 리턴하는 메소드 한개(PI * radius * radius)
	// 매개변수 없이
	public double area() {
		return PI * radius * radius;
	}
	
	
	
	
	
	
	
	
	
}
