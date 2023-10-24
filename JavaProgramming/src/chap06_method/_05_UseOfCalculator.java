package chap06_method;

import chap06_method.calc.CompleteCalculator;

public class _05_UseOfCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompleteCalculator ccalc = new CompleteCalculator();
		
		int result;
		double dResult;
		
		int num1 = 115;
		int num2 = 27;
		
		result = ccalc.add(num1, num2);
		System.out.println("num1 + num2 = " + result);
		
		result = ccalc.sub(num1, num2);
		System.out.println("num1 - num2 = " + result);
		
		result = ccalc.mul(num1, num2);
		System.out.println("num1 * num2 = " + result);
		
		dResult = ccalc.div(num1, num2);
		System.out.println("num1 / num2 = " + dResult);
		
		result = ccalc.mod(num1, num2);
		System.out.println("num1 % num2 = " + result);
	}

}
