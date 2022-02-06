package ch11;

import ch10.Outer;

public class ExceptionEx0 {
	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		
		//int val = j / i;				// ArithmeticException
		int[] arr1 = new int[3];
		//int[] arr2 = new int[-3];		// NegativeArraySizeException
		
		Outer out1 = new Outer();
		out1.i = 10;
		Outer out2 = null;
		//out2.i = 20;					// NullPointerException
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		//arr1[5] = 4;					// IndexOutOfBoundException
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3/0);		// ArithmeticException
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		
		System.out.println("프로그램 마침");
	}
}
