package _1020_homework;


public class Reverse {
		
	String reverseString(String str) {
		String[] arr = new String[str.length()];
		for (int i = 0 ; str.length() > i ; i ++) {
			arr[str.length()-1 -i] = str.substring(i,i+1);
		}
		return String.join("",arr);
	}
	String reverseString2(String str) {
		String[] arr = new String[str.length()];
		for (int i = 0 ; str.length() > i ; i ++) {
			if ((i+1)%3 == 0) {
				arr[i] = "3";
			}
			else if((i+1)%5 == 0) {
				arr[i] = "5";
			}
			else {
				arr[i]=str.substring(i,i+1);
			}
		}
		return String.join("",arr);
	}
}
