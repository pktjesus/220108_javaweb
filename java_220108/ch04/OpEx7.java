package ch04;

public class OpEx7 {

	public static void main(String[] args) {
		// 4.7 삼항연산
		int score = 40;
		// score변수값이 60이상이면 합격 아니면 불합격
		String isPass = score >= 60 ? "합격" : "불합격";
		System.out.println(isPass);		// 불합격
		
		int score2 = 85;
		String result = (!(score2 > 90) ? "가" : "나");
		System.out.println(result);		// 가
		
		// 4.8 문자열연산(concatenate)
		String name = "홍길동";		// 문자열
		System.out.println("안녕하세요 " + name + "입니다."); // concatenate
		
		int height = 180;		// 숫자
		System.out.println("저의 키는 " + height + "cm입니다."); // 180숫자를 "180"문자열로 자동형변환
		
		// String weight = 75.5;		// 에러
		String weight = 75.5 + "";	// 75.5숫자를 "75.5"문자열로 자동형변환
		System.out.println("저의 몸무게는 " + weight + "kg입니다.");
		
		int ageInt = 30; // 숫자(정수)
		String ageStr = "30"; // 문자열
	}

}
