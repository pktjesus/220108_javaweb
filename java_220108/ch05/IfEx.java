package ch05;

public class IfEx {

	public static void main(String[] args) {
		int score = 55;

		System.out.println("시험 시작");
		
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println();
		System.out.println(score >= 60 ? "합격입니다" : "불합격입니다.");
		
		System.out.println("시험 끝");
	}

}
