package chap05_array;

public class _03_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. chArr의 요소 중 소문자는 대문자, 대문자는 소문자로 변경하여
		// convertArr에 저장
		char[] chArr = {'b', 'I', 't', 'C'};
		//{'B', 'i', 'T', 'c'}
		char[] convertArr = new char[4];
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] >= 'A' && chArr[i] <= 'Z') {
				convertArr[i] = (char)(chArr[i] + 32);
			} else {
				convertArr[i] = (char)(chArr[i] - 32);
			}
		}
		
		for(int j = 0; j < convertArr.length; j++) {
			System.out.println(convertArr[j]);
		}
	}

}
