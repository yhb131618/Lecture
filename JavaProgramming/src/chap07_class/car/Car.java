package chap07_class.car;

public class Car {
	// 1. 자동차의 속성값들
	public String company;
	public String model;
	public String color;
	public int price;
	
	// 2. 자동차의 기능
	public void turnOn() {
		System.out.println("시동을 켠다.");
	}
	
	public void turnOff() {
		System.err.println("시동을 끈다.");
	}
	
	public void speedUp() {
		System.out.println("속도를 높인다.");
	}
	
	public void speedDown() {
		System.out.println("속도를 줄인다.");
	}
	
	public void carInfo() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
