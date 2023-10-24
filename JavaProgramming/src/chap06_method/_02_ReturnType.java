package chap06_method;

import chap06_method.calc.ReturnCalculator;

public class _02_ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnCalculator rcalc = new ReturnCalculator();
		
		// 1. 결과 값이 없는 메소드의 호출
		rcalc.add();
		
		// 2. 결과 값이 있는 메소드의 호출
		// 이런식으로 호출하면 div()의 결과값이
		// 의미없는 값이 된다.
		rcalc.div();
		
		// 결과 값이 있는 메소드는 결과 값과
		// 같은 타입의 변수에 저장을 하던가
		// 다른 메소드에 전달해서 바로 사용한다.
		double dNum = rcalc.div();
		System.out.println(dNum);
		
		System.out.println(rcalc.div());
		
		printDouble(rcalc.div());
		
		
		String str = rcalc.strAdd();
		
		int[] intArr = rcalc.createArray(); 
		
		
		
		
		
	}
	
	public static void printDouble(double d) {
		System.out.println(d);
	}

}
