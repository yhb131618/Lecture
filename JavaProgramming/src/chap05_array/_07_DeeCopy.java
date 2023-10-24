package chap05_array;

public class _07_DeeCopy {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int[] copyArr = arr.clone();
		
		System.out.println(arr);
		System.out.println(copyArr);
		System.out.println(arr == copyArr);
		
		arr[0] = 20;
		
		System.out.println(copyArr[0]);
		
		int[] copyArr2 = new int[5];
		System.arraycopy(arr,  0, copyArr2,0, arr.length);
		for (int i : copyArr) {
			System.out.println(i);
			
		}
	}
}
