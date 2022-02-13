package ch12;

public class StringEx {

	public static void main(String[] args) {
		int score = 90;
		System.out.println("당신의 점수는 " + score + "입니다."); // 자동형변환
		
		//String s = score;	// 데이터타입이 달라 에러
		String s = String.valueOf(score); // 숫자를 String으로 형변환
		String s2 = score + ""; // 문자열을 + 연산하여 String으로 형변환
		
		String text1 = "나는 학생입니다.";		// 문자열
	}

}
