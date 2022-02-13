package ch12;

public class StringEx8 {

	public static void main(String[] args) {
		// 기본자료형 -> 문자열               문자열 -> 기본자료형
		// String.valueOf(숫자 파라미터)     Integer.parseInt(문자열 파라미터)

		String[] str = {"1", "2", "3", "4"};
		
		int sum1 = 0;
		for (int i=0; i<str.length; i++) {
			sum1 += Integer.parseInt(str[i]);		// "1234" (X)  1 + 2 + 3 + 4 = 10 (O)
		}
		System.out.println("sum1 = "+sum1);
		
		long sum2 = 0;
		for (int i=0; i<str.length; i++) {
			sum2 += Long.parseLong(str[i]);
		}
		System.out.println("sum2 = "+sum2);
		
		double sum3 = 0;
		for (int i=0; i<str.length; i++) {
			sum3 += Double.parseDouble(str[i]);
		}
		System.out.println("sum3 = "+sum3);
		
		/*
		기본자료형    클래스(Wrapper)
		boolean     Boolean
		int         Integer
		long        Long
		*/ 
	}

}
