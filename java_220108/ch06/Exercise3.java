package ch06;

public class Exercise3 {

	public static void main(String[] args) {
		// 다음 배열에 담긴 점수들의 합계 점수와 평균점수를 출력하는 코드를 작성
		int[] score = {90, 80, 60, 100};
		
		int totalScore = 0;
		double avgScore = 0;
		
		// 코드 작성
		for (int i = 0; i < score.length; i++) {
			totalScore += score[i];
		}
		avgScore = (double) totalScore / score.length;
		
		System.out.println("합계 점수 : "+totalScore);
		System.out.println("평균 점수 : "+avgScore);
		
		System.out.println();
		////////////////////////////////////////////////////////////////
		// 주어진 배열의 전체 항목의 합과 평균값을 구하는 코드 작성(중첩for문 사용)
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88},
		};
		int sum = 0;
		double avg = 0.0;
		
		// 코드 작성
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		avg = (double) sum / cnt;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);	// avg 소수점 첫번째 자리까지는 표시
	}
}



