package ch12;

// �Ʒ� ������ �߿� �̸��� ��µǵ��� �ڵ带 �ۼ��ϰ�
// ��ü �������� ��ճ��̸� ����ϴ� �ڵ带 �ۼ�
// (for���� split()�޼��� ���)
public class Excercise4 {

	public static void main(String[] args) {
		// ���̵�,�̸�,����
		String[] member = {
				"hong,ȫ�浿,30",
				"lee,�̼���,40",
				"kim,������,50"
		}; 
		
		// �̸� ���
		// ��� ���� ���
		int ageSum = 0;
		// �ڵ� �ۼ�
		for (int i = 0; i < member.length; i++) {
			String[] memberArr = member[i].split(",");
			System.out.println(memberArr[1]);
			
			ageSum += Integer.valueOf(memberArr[2]);
		}
		
		double ageAverage = (double)ageSum / member.length;
		System.out.println("��ճ��� : " + ageAverage);
	}

}
