package chap06_method.game;

import java.util.Random;

public class Lotto {
	// 1. 1~45까지 숫자 중 랜덤 값 7개를 저장하는 배열을 리턴하는 메소드를 만드세요.
	// 중복제거하는 로직 포함. generateRandomArray
	public int[] generateRandomArray() {
		int[] lotto = new int[7];
		Random random = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			
			if(i > 0) {
				if(isDuplicated(lotto, i)) {
					i--;
					continue;
				}
			}
		}
		
		return lotto;
	}
	
	// 2. 중복체크 하는 메소드 분리
	// isDuplicated메소드 return타입은 boolean, 매개변수 int[] arr, int idx
	public boolean isDuplicated(int[] arr, int idx) {
		for(int i = 0; i < idx; i++) {
			if(arr[idx] == arr[i]) {
				//return 문을 만나면 메소드가 즉시 종료되기때문에 break문이 필요없다.
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
