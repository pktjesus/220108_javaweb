package ch04;

public class Excercise3 {
	public static void main(String[] args) {
		// 코드 작성1(참고 : 1다스는 12개)
		int colorPen = 5 * 12;		// 60
		int studentCount = 27;
		
		// 코드 작성2
		int divColorPen = colorPen / studentCount;
		System.out.println("학생당 나눠가지는 색연필수 : " + divColorPen);
		
		// 코드 작성3
		int remainColorPen = colorPen % studentCount;
		System.out.println("똑같이 나눠가지고 남은 볼펜수 : " + remainColorPen);
	}
}
