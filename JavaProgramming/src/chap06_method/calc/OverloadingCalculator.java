package chap06_method.calc;

public class OverloadingCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	// 오버로딩된 메소드: 매개변수의 타입, 개수, 순서를 변경해서 같은 이름의 메소드를 선언한다.
	public int add(double a, int b) {
		return (int)a + b;
	}
	
	public int add(int a, double b) {
		return a + (int)b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public int add(int a) {
		return a + a;
	}
	
	// 첫 번째 add 메소드와 매개변수 타입, 개수, 순서가 모두 동일하기 때문에
	// 같은 메소드로 인식하여 선언할 수 없다.
//	public int add(int c, int d) {
//		return c + d;
//	}
	
	
	
	
	
	
	
	
	
	
	
}
