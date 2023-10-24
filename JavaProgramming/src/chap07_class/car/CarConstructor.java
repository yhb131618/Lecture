package chap07_class.car;

public class CarConstructor {
	// 1. 자동차의 속성값들
	public String company;
	public String model;
	public String color;
	public int price;
	
	// 3. 생성자(생성자는 관례적으로 속성과 기능 사이에 정의한다.)
	// 접근제어자 + 클래스명() {}
	// 매개변수가 없는 생성자를 기본생성자라고 부른다.
	// 생성자는 클래스의 속성을 초기화할 때 많이 사용한다.
	public CarConstructor() {
		company = "현대";
	}
	
	public CarConstructor(String c) {
		company = c;
	}
	
	// 매개변수가 있는 생성자
	// 매개변수를 통해서 속성값들을 초기화한다.
	// 매개변수 생성자에서 관례적으로 어떤 값을 초기화하는 변수인지를 명확하기 위해서
	// 매개변수명을 속성변수명과 일치시켜준다.
	public CarConstructor(String company, 
						  String model, 
						  String color, 
						  int price) {
		// 매개변수로 속성을 초기화할때 사용하는 this객체
		// this객체는 생성된 이 클래스 객체를 지칭한다.
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
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
