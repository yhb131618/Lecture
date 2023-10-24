package _homework_03_01;

public class _01_homework {
	public static void main(String[] args) {
		Cat cat = new Lion("크헝", "사자");
		
		cat.animalBark();
		cat.animalKind();
		
		cat = new Tiger("어흥", "호랑이");
		
		cat.animalBark();
		cat.animalKind();
		
		cat.birth1();
		cat.birth2();
		
	}
}
