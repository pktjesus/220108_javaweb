package ch06;

public class Exercise3 {

	public static void main(String[] args) {
		// ���� �迭�� ��� �������� �հ� ������ ��������� ����ϴ� �ڵ带 �ۼ�
		int[] score = {90, 80, 60, 100};
		
		int totalScore = 0;
		double avgScore = 0;
		
		// �ڵ� �ۼ�
		for (int i = 0; i < score.length; i++) {
			totalScore += score[i];
		}
		avgScore = (double) totalScore / score.length;
		
		System.out.println("�հ� ���� : "+totalScore);
		System.out.println("��� ���� : "+avgScore);
		
		System.out.println();
		////////////////////////////////////////////////////////////////
		// �־��� �迭�� ��ü �׸��� �հ� ��հ��� ���ϴ� �ڵ� �ۼ�(��øfor�� ���)
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88},
		};
		int sum = 0;
		double avg = 0.0;
		
		// �ڵ� �ۼ�
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		avg = (double) sum / cnt;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);	// avg �Ҽ��� ù��° �ڸ������� ǥ��
	}
}



