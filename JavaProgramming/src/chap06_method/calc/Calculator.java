package chap06_method.calc;

public class Calculator {
	private int num;
	private String userId;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	// 1. public 메소드
	// 어디서나 접근 가능한 메소드
	public void add() {
		System.out.println(10 + 20);
	}
	
	// 2. protected 메소드
	// 같은 클래스, 같은 패키지내의 클래스, 자식 클래스
	protected void sub() {
		System.out.println(20 - 10);
	}
	
	// 3. default 메소드
	// 같은 클래스, 같은 패키지내의 클래스
	void mul() {
		System.out.println(20 * 10);
		div();
	}
	
	// 4. private 메소드
	// 같은 클래스
	// private 접근제어자는 같은 클래스 안에서만 사용이 가능
	private void div() {
		System.out.println(20 / 10);
	}
	
	
	
	
	
	
	
	
	
}
