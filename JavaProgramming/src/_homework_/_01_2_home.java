package _homework_;

public class _01_2_home {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++) {
			if (i%2 == 0 && i %3==0)  {
				System.out.print(i + ", ");
			} 
	}
		int a = 10;
		while ( a > 0){
		 	if (a%2 == 0) {
		 		System.out.println(a);
		 	}
			a--;
		}
		int sum =0;
		for(int i = 1; i <= 1000; i++) {
			if (i%2 == 0 && i %7==0)  {
				System.out.println(i);
				sum += i;
			} 
	}
		System.out.println(sum);
			
		
 }
}
