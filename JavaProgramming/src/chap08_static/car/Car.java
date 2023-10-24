package chap08_static.car;

public class Car {
	// 1. 인스턴스 변수
	public String company;
	public String model;
	public String color;
	public int price;
	
	// 2. static 변수
	public static String grade;
	
	// 3. 인스턴스 메소드
	public void carInfo() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
	}
	
	// 4. static 메소드
	public static void getCurrentGrade() {
		System.out.println("현재 등급은 " + grade + "입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
