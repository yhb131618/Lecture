package chap05_array;

public class _05_AdvancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100, 84, 56, 72, 68};
		
		int sum = 0;
		
		// 1. 향상된 for문 사용
		// 배열의 요소에 하나씩 순회하면서 사용한다.
		for(int sc : score) {
			System.out.println(sc);
			sum += sc;
		}
		
		System.out.println("점수의 총합: " + sum);
		
		double avg = (double)sum / score.length;
		
		System.out.println("점수의 평균: " + avg);
	}

}
