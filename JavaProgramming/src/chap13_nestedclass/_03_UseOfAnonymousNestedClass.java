package chap13_nestedclass;

import chap13_nestedclass.nestedclass.*;

public class _03_UseOfAnonymousNestedClass {
	public static void main(String[] args) {
		// 1. 익명 중첩 클래스
		// 익명 중첩 클새스는 추상 클래스나 인터페이스를 상속받은 자식클래스를 만들지 않고도
		// 인스턴스를 생성해서 사용할 수 있겠 해준다.
		// 생성자를 호출하면서 추상메소드르 구현한다.
		AnonymousNestedClass anc = new AnonymousNestedClass() {
			
			@Override
			public void calculate(int a, int b) {
				System.out.println(a+b);
			}
		};
		
		anc.calculate(10,20);
	}
}
