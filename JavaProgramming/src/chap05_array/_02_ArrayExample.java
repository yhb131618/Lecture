package chap05_array;

public class _02_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 10개 정수형 배열을 생성하고 3의 배수만 10개를 저장하세요.
		int[] intArr = new int[10];
		
//		for(int i = 0; i < intArr.length; i++) {
//			intArr[i] = (i + 1) * 3;
//		}
		
		int num = 0;
		int index = 0;
		
		while(index < intArr.length) {
			num++;
			
			if(num % 3 == 0) {
				//num == 1, index = 0
				//num == 2, index = 0
				//num == 3, intArr[0] = 3, index = 1
				intArr[index++] = num;
			}
		}
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		
		
		
		
		
		
		
	}

}
