package ch07;

public class ReturnEx2 {

	public static void main(String[] args) {
		// return���� ����� �޼��带 ������Ű�� ���
		Return2 obj = new Return2();
		
		obj.getTest(0);
		System.out.println();
		obj.getTest(1);
		
		System.out.println();
		System.out.println(obj.getName(0));		// ȫ�浿
		System.out.println(obj.getName(1));
	}

}
class Return2 {
	void getTest(int type) {
		System.out.println("getTest() �޼��� ����");
		
		if (type == 1) {
			return;			// �޼ҵ� ���� ����
		}
		
		System.out.println("getTest() �޼��� ��");
	}
	
	String getName(int type) {
		if (type == 1) {
			return "";		// �޼ҵ� ���� ����
		}
		
		return "ȫ�浿";
	}
	
	String getAge(int type) {
		return "12";
		// return "ȫ�浿";	// error -> ���� �� �ȿ� return Ű���尡 2�� �̻� ��� �Ұ��� -> 1���� ��밡��
	}	
}