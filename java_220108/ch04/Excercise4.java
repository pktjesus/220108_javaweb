package ch04;

public class Excercise4 {
	public static void main(String[] args) {
		int age = 7;			// 아이의 나이
		int height = 121;		// 아이의 키
		boolean parent = false;	// 보호자 동반여부
		boolean heartDease = false;	// 심장질환자 여부
		
		// 연산 코드 작성
		boolean take = ((age >= 6 && height >= 120) || (height >= 120 && parent == true)) && heartDease == false;  	
		
		System.out.println(take ? "탑승가능" : "탑승불가능");
	}
}