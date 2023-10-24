package _book_java;

public class _07_SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_07_SmartPhone myPhone = new _07_SmartPhone("갤럭시","은색");
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("모델: " + myPhone.color);
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
		myPhone.bell();
		
		 
	}

}
