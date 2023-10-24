package chap05_array;

import java.util.Random;

public class _08_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 정수 7개를 저장할 수 있는 배열을 만들고
		int[] lotto = new int[7];
		Random random = new Random();
		
		// 2. 1~45까지 숫자 중 랜덤 값 7개를 저장(중복제거)
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			
			//중복제거
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
		}
		
		// 3. 로또번호 출력 0~5의 인덱스는 실제 당첨 번호 6번 인덱스는 보너스번호
		// 이번주 로또 번호는 1, 2, 3, 4, 5, 6, 보너스번호: 7
		System.out.print("이번주 로또 번호는 ");
		for(int i = 0; i < lotto.length; i++) {
			if(i == lotto.length - 1) {
				System.out.print("보너스 번호: " + lotto[i]);
			} else {
				System.out.print(lotto[i] + ", ");
			}
		}
	}

}
