package _homework_03_01;

public class Lion extends Cat{
	public Lion(String bark, String kind) {
		this.catbark = bark;
		this.catkind = kind;
		
		System.out.println("자식 클래스 사자입니다.");
	}
	public void animal1() {
		System.out.println("나는 사자입니다.");
	}	
	public void animal2() {
		System.out.println("나는 고양이과입니다.");
	}
}
