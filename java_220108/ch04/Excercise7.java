package ch04;

public class Excercise7 {

	public static void main(String[] args) {
		int number = 123;
		int result = number / 100 * 100;
		System.out.println(result);
		
		int result2 = number - number % 100;
		System.out.println(result2);
		
		//-------------------------------------------------------------------
		int price = 187000;
		int oman = price / 50000;		// 5만원권 장 수 -> 3
		int ilman = (price % 50000) / 10000;	// 1만원권 장 수 -> 3
		int ochun = (price % 10000) / 5000;		// 5천원권 당 수 -> 1
		int ilchun= (price % 5000) / 1000;		// 1천원권 당 수 -> 2
		
		System.out.println("5만원권 : "+oman+"장");
		System.out.println("1만원권 : "+ilman+"장");
		System.out.println("5천원권 : "+ochun+"장");
		System.out.println("1천원권 : "+ilchun+"장");
	}

}
