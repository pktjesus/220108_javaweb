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
		int oman = price / 50000;		// 5������ �� �� -> 3
		int ilman = (price % 50000) / 10000;	// 1������ �� �� -> 3
		int ochun = (price % 10000) / 5000;		// 5õ���� �� �� -> 1
		int ilchun= (price % 5000) / 1000;		// 1õ���� �� �� -> 2
		
		System.out.println("5������ : "+oman+"��");
		System.out.println("1������ : "+ilman+"��");
		System.out.println("5õ���� : "+ochun+"��");
		System.out.println("1õ���� : "+ilchun+"��");
	}

}
