package ch12;

// 아래 데이터 중에 이름만 출력되도록 코드를 작성하고
// 전체 데이터의 평균나이를 출력하는 코드를 작성
// (for문과 split()메서드 사용)
public class Excercise4 {

	public static void main(String[] args) {
		// 아이디,이름,나이
		String[] member = {
				"hong,홍길동,30",
				"lee,이순신,40",
				"kim,김유신,50"
		}; 
		
		// 이름 출력
		// 평균 나이 출력
		int ageSum = 0;
		// 코드 작성
		for (int i = 0; i < member.length; i++) {
			String[] memberArr = member[i].split(",");
			System.out.println(memberArr[1]);
			
			ageSum += Integer.valueOf(memberArr[2]);
		}
		
		double ageAverage = (double)ageSum / member.length;
		System.out.println("평균나이 : " + ageAverage);
	}

}
