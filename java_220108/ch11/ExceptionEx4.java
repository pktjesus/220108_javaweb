package ch11;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println("DB���� ����");

		try {
			System.out.println("DB�۾�");
			System.out.println(3/0);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB�۾� �� ���ܹ߻�");
		} finally {			// ����ó�� ���ο� ������� �׻� ����ǵ��� �������ִ� Ű����
			System.out.println("DB���� ����");
		}  
	}

}
