package chap09_inherit.animal;

public class Animal {
	int age;
	String size;
	int legCnt;
	boolean hasWing;
	
	public Animal() {
		
	}	
	
	public Animal(int age, String size,
			int legCnt, boolean hasWing) {

	}
	public void eat() {
		System.out.println("먹는다."); 
	}
	
	public void sleep() {
		System.out.println("잠을 잔다..");
	}
}

