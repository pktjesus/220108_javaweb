package ch04;

public class Excercise4 {
	public static void main(String[] args) {
		int age = 7;			// ������ ����
		int height = 121;		// ������ Ű
		boolean parent = false;	// ��ȣ�� ���ݿ���
		boolean heartDease = false;	// ������ȯ�� ����
		
		// ���� �ڵ� �ۼ�
		boolean take = ((age >= 6 && height >= 120) || (height >= 120 && parent == true)) && heartDease == false;  	
		
		System.out.println(take ? "ž�°���" : "ž�ºҰ���");
	}
}