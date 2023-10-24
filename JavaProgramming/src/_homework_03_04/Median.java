package _homework_03_04;
import java.util.Scanner;

public class Median {


	static int med3(int a, int b, int c) {
		int mid, max;
		int[] arr = {a, b, c};
		int[] arr2 = new int[3];
		int min = arr[0];
		arr2[0] = arr[0];
		for (int i = 0 ; i < arr.length ; i++) {

				for (int j = 0 ; j < arr.length ; j++) {
					if (i < j) {
						//i--;
						if (arr[i] < arr[j]) {
							min = arr[j];
							arr[j] = arr[i];
							arr[i] = min;
							
							
						}

					}
				}

			}
			mid = arr[1];
			max = arr[2];
			return mid;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을구합니다.");
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
	}
}

