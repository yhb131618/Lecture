package chap07_class.game;

import java.util.Scanner;

public class NumBaseball {
	// 1. 컴퓨터가 0~9까지의 랜덤값을 3개 배열에 저장(중복불가능) 0, 1, 2 ~ 9, 8, 7
	// 2. 사용자가 0~9 세번 입력해서 배열에 저장(중복불가능) 0, 1, 2 ~ 9, 8, 7
	// 3. 사용자가 입력한 숫자 중 컴퓨터의 랜덤값과 같은 숫자면서 위치가 다르면 볼
	// 4. 사용자가 입력한 숫자 중 컴퓨터의 랜덤값과 같은 숫자면서 위치가 같으면 스트라이크
	// com {1, 2, 3} user {1, 3, 5} => 1스트라이크 1볼
	// com {1, 2, 3} user {4, 5, 6} => 0스트라이크 0볼
	// com {1, 2, 3} user {2, 3, 1} => 0스트라이크 3볼
	// com {1, 2, 3} user {1, 2, 3} => 3스트라이크 아웃
	// 3스트라이크 될 때까지 사용자가 3회씩 입력할 수 있도록
	
	// 클래스에 필요한 변수
	// 스트라이크와 볼을 세어줄 변수
	int strike = 0;
	int ball = 0;
	
	// 컴퓨터 랜덤 배열
	int[] com = new int[3];
	
	// 사용자 입력한 값을 담아줄 배열
	int[] user = new int[3];
	
	Scanner sc = new Scanner(System.in);
	
	//게임을 시작하는 메소드
	public void start() {
		//com 배열에 들어갈 3개의 숫자 저장
		for(int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random() * 10);
			
			//중복 제거
			if(i > 0) {
				if(isDuplicated(com, i)) {
					i--;
					continue;
				}
			}
		}
		
		while(true) {
			strike = 0;
			ball = 0;
			
			//컴퓨터 숫자 확인
			for(int i : com) {
				System.out.print(i);
			}
			System.out.println();
			
			// 사용자가 입력한 정수 3개 저장
			for(int i = 0; i < user.length; i++) {
				System.out.println("0~9 중 하나를 입력하세요.");
				user[i] = sc.nextInt();
				
				//중복제거
				if(i > 0) {
					if(isDuplicated(user, i)) {
						System.out.println("중복된 값이 있습니다. 다시 입력하세요.");
						i--;
						continue;
					}
				}
			}
			
			//사용자 입력 값 출력
			for(int i : user) {
				System.out.print(i);
			}
			System.out.println();
			
			// 컴퓨터 랜덤값과 사용자가 입력한 값 비교
			judgeStrike();
			
			if(strike == 3) {
				System.out.println("3스트라이크 아웃. 게임을 종료합니다.");
				break;
			} else {
				System.out.println(strike + "스트라이크, " + ball + "볼");
			}
		}
	}
	
	public boolean isDuplicated(int[] arr, int idx) {
		for(int i = 0; i < idx; i++) {
			if(arr[idx] == arr[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	public void judgeStrike() {
		for(int i = 0; i < com.length; i++) {
			for(int j = 0; j < user.length; j++) {
				//스트라이크나 볼
				if(com[i] == user[j]) {
					//위치도 같으면 스트라이크
					if(i == j) {
						strike++;
					} else {
						//위치는 다르면 볼
						ball++;
					}
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
