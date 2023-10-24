package _homework_;
import java.util.Scanner;
public class _01_1_home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);	
		int a = 10;
		int b = 20;
		
		
			System.out.println( a > b ? "true" : "false");
			System.out.println( a < b ? "true" : "false");
	   int i = 11;
	   System.out.println("========03=======");	   
	   while(i > 1) {
		   System.out.println(--i);
	   }
	   System.out.println("========04=======");
	   int j = 10;
	   do {
		   System.out.println(j);
		   j--;
	   }
	   while(j > 0); 
	   System.out.println("========05=======");
	   for (int k = 10 ; k > 0 ; k--) {
	   	System.out.println(k);
	   }
	   System.out.println("========06=======");	   
	   
	   i = 1;
	   int sum = 0;
	   while(i < 101) {
		   System.out.println(sum+=i);
		   i++;
	   }
	   System.out.println("========07=======");	   
	   
	   i = 1;
	   sum = 0;
	   do {
		   System.out.println(sum+=i);
		   i++;
	      
	   }
	   while(i < 101);
	   System.out.println("========08=======");	   
	   
	 
	   sum = 0;

	   for (i = 1 ; i < 101 ; ++i){
		   System.out.println(sum+=i);
	   }	   
	   System.out.println("========09=======");	 	
	   	int[] numArr = new int [10];
	   	
	   	for (i=0 ; numArr.length > i ; i++ ) {
	   		
	   
	   		numArr[i] = (i+1)*3; 	
	   		System.out.println(33-numArr[i]);
	   	
	   	}
	   System.out.println("========10=======");	 	
		   	int[] numArr2 = new int [10];
		   	
		   	Scanner sc = new Scanner(System.in);
		   	sum =0;
		   	//for (i=0 ; numArr2.length > i ; i++ ) {
				//System.out.println("숫자를 입력하세요1");
				//numArr2[i] = sc.nextInt();
		        //sum += numArr2[i]; 
		   		 	
				
		   	//}
			//System.out.println(sum);
			System.out.println("========11=======");	 	
			   	int[] numArr3 = new int [10];
			   	
			   	sum =0;
			   	for (i=0 ; numArr3.length > i ; i++ ) {
					numArr3[i] = (int)(Math.random()*10)+1;
			        if (numArr3[i] %2 != 0 ) {
			        	System.out.println(numArr3[i]);
			        } 	
					
			   	}
				System.out.println("========12=======");	 	
				   	int[] numArr4 = new int [10];
				   	
				   	sum =0;
				   	for (i=0 ; numArr4.length > i ; i++ ) {
						System.out.println("숫자를 입력하세요1");
						numArr4[i] = sc.nextInt();
				   		 	
				    }
				   	for (i=0 ; numArr4.length > i ; i++ ) {
						if (numArr4[i]%2 == 0 || numArr4[i]%3 ==0) {
							System.out.println(numArr4[i]);	
						} 
				   		 	
				    }
					//
	}
	
}
