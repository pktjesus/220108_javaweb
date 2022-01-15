package ch05;

public class IfEx3 {

	public static void main(String[] args) {
		int math = 90;
		int eng = 95;
		
		if (math >= 60) {
			if (eng >= 60) {
				System.out.println("Ελ°ϊ");
			}
		} else {
			System.out.println("Ε»¶τ");
		}
		
		if (math >= 60 && eng >= 60) {
			System.out.println("Ελ°ϊ");
		} else {
			System.out.println("Ε»¶τ");
		}
		
	}

}
