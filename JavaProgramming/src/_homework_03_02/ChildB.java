package _homework_03_02;

public class ChildB extends Human{

	String finger;
	
	public ChildB(String lastname, String blood,int tall, String color, String finger) {
		super.lastname = lastname;
		super.blood = blood;
		super.tall = tall;
		super.color = color;
		this.finger = finger;
	}
}
