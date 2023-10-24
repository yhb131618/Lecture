package chap06_method.calc;

public class ReturnCalculator {
	// 1. 결과 값이 없는 메소드
	public void add() {
		System.out.println(20 + 10);
		//void로 지정된 메소드에서 return 문 사용시 에러 발생
//		return 10;
	}
	
	
	// 2. 결과 값이 int형인 메소드
	// 결과 값이 있는 메소드는 항상 return 구문 사용
	public int sub() {
		return 10 + 20;
	}
	
	// 지정한 리턴타입과 다른 타입의 결과값이 반환되면 안된다.
//	public int div() {
//		return (double)20 / 10;
//	}
	
	public double div() {
		return (double)20 / 10;
	}
	
	// 참조형 타입도 리턴타입으로 지정 가능
	public String strAdd() {
		return "hello" + " java";
	}
	
	public int[] createArray() {
		return new int[5];
	}
	
	
	
	
	
	
	
	
	
	
}
