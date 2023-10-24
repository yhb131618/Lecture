package chap06_method;

import chap06_method.calc.Calculator;

public class _01_AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 객체 생성(부품)
		// 메인메소드가 없는(실행 클래스가 아닌) 클래스는 
		// 부품(변수)으로 만들어서 사용
		Calculator cal = new Calculator();
		
		// 객체(부품) 안의 기능이나 속성들을 사용하려면 
		// 변수명.속성명이나 변수명.기능명을 사용한다.
		// 현재 Calculator 클래스와 다른 패키지에 있기 때문에
		// public 접근제어자만 호출 가능하다.
		cal.add();
	}

}
