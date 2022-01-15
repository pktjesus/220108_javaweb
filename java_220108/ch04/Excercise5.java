package ch04;

public class Excercise5 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);		// 선증감연산자는 0순위
		
		System.out.println(x);	// 11
		System.out.println(y);  // 19
		System.out.println(z);	// 31(O), 30(x)
	}

}
