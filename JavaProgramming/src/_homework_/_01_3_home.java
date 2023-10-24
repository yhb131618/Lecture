package _homework_;

import java.util.Scanner;

public class _01_3_home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		System.out.println("========02=======");
	   	Scanner sc = new Scanner(System.in);		
		System.out.println("숫자를 입력하세요");
		int num2 = sc.nextInt();		
		System.out.print("<");
        int sum = 0;
		if ( num2/50000 >= 1) {
        		System.out.print("오만원 "+ num2/50000 +"매");
        		sum = num2%50000;
        } 

        System.out.print(">"+sum);
		
		System.out.println("========03=======");	 	
		



		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		String str = Integer.toString(num);

		System.out.print("박수");
        for (int i = 0 ; str.length() > i; i++) {
        	if ( str.charAt(i)%3 == 0) {
        		System.out.print("짝");
        	} 
        }
    	System.out.println("");		   
	System.out.println("========04======");	
	int j = 4;
	for(int i =0 ; 10 >i ; i++) {
		
		if (i%2 == 1 || i == 1) {
	    	System.out.println(" ".repeat(j)+"*".repeat(i));
	    	j--;
		}
    		  
	   }
	}
}

