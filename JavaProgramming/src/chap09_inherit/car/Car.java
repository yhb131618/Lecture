package chap09_inherit.car;

public class Car {
	// 1. 인스턴스 변수
	public String company;
	public String model;
	public String color;
	public int price;
	
	// 2. 인스턴스 메소드
	public void carInfo() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
	}
}
