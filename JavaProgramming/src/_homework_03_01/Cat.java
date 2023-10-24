package _homework_03_01;

public class Cat extends Mammalia {
	public String catbark;
	public String catkind;
	
	public Cat() {
		System.out.println("부모 클래스 고양이과입니다.");	}
	
	public void animalBark() {
		System.out.println("나는 웁니다 " +catbark);
	}
	public void animalKind() {
		System.out.println("나는 " + catkind);
	}
}
