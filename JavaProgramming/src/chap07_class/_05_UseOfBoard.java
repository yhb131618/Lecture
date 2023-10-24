package chap07_class;

import chap07_class.board.*;

public class _05_UseOfBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 클래스는 변수로 선언해서 객체를 값으로 받아서 사용한다.
		// 따라서 클래스는 사용자가 직접 만든 타입으로 생각해도 된다.
		
		Board board;
		
		//2. 클래스 내의 속성이나 기능들은 객체가 만들어진 후에 사용 가능하고,
		//객체.속성명, 객체.기능명으로 사용한다.
		
		//3. 객체를 만드는 과정은  new 키워드 + 생성자를 통해서 진행된다.
		board = new Board();
		
		board.setBoardNo(1);
		board.getBoardNo();
		board.setBoardContent("내용");
		System.out.println(board.getBoardContent());
		
		
		// 4. 클래스 타입의 값은 캑체
		printBoardInfo(board);
		printBoardInfo(new Board());
		
	}
		public static void printBoardInfo(Board board) {
			System.out.println("게시글번호: " + board.getBoardContent());
			System.out.println("게시글내용: " + board.getBoardContent());
			
		}


}
