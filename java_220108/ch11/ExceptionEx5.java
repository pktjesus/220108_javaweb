package ch11;

public class ExceptionEx5 {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		try {
			throw new Exception("���� �߻�");		// ������ ���ܸ� �߻���Ŵ
		} catch (Exception e) {
			e.printStackTrace();		// ���� ��� ���� �α�
			System.out.println(e.getMessage());
		}
		
		System.out.println("���α׷� ����");
	}
}
