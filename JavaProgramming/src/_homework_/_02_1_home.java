package _homework_;

import java.util.Scanner;
import java.util.Random;

public class _02_1_home {
	// 가위 바위 보 게임을 클래스로 만드세요.
	// 컴퓨터가 0, 1, 2 랜덤값을 하나 선택했고,
	//사용자가 가위,바위,보를 입력해서 사용자가 이기면 이겼습니다. 지면 졌습니다. 비기면 비겼습니다를 출력하세요.
	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();
	String str;
	int num;
	String scin;
	int renum;
	


	public void start() {

		//랜덤 숫자와 문자열을 매치

        // 가위 바위 보 입력
		while(true){
		num = rd.nextInt(3);
		System.out.println(num);
		System.out.println("가위, 바위, 보 중 하나를 입력하세요");
		scin = sc.next();
		System.out.println(scin);

		if (scin.equals("가위")) {
			renum = 0;
			System.out.println(renum);
		}
		else if (scin.equals("바위")) {
			renum = 1;
			System.out.println(renum);
		}
		else if (scin.equals("보")) {
			renum = 2;
			System.out.println(renum);
		}
		else if (scin.equals("멈춰")) {
			break;
		}
		if (renum == num) {
			  System.out.println("비겼습니다.");
		}
		else {
			
			//System.out.println(renum - num);	
			if((renum - num) == 1 || (renum - num) == -2  ) {
			  System.out.println("이겼습니다.");
			}
			else if((renum - num) == -1 || (renum - num) == 2 ) {
			  System.out.println("졌습니다.");
	
		}		
		}
	 }
	}
   }
	
	

