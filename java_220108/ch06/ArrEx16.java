package ch06;

public class ArrEx16 {

	public static void main(String[] args) {
		// �迭
		int[] arrInt = {1,2,3,4,5};
		
		// ���� for���� �̿��� ���
		for (int i=0; i<arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		// ���� for���� �̿��� ���
		// ���� : ���۰� ���� ����� ���Ǵ�� ������ �� ����
		// ���� : ���Ⱑ �̻ڰ� ����ϱ� ����.
		for (int number : arrInt) {
			System.out.println(number);
		}
		
		// �迭
		String[] names = {"ȫ�浿", "�̼���", "������"};
		int[] scores = {90,80,100};
		
		int i = 0;
		for (String name : names) {
			System.out.println(name + " : " + scores[i]);
			i++;
		}
	}
}
