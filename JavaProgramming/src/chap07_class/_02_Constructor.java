package chap07_class;

import chap07_class.car.CarConstructor;

public class _02_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarConstructor car = new CarConstructor();
		
		System.out.println(car.company);
		
		CarConstructor car1 = 
				new CarConstructor("현대", "제네시스", "검정", 500000000);
		
		car1.carInfo();
	}

}
