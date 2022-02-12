package ch11;

public class ExceptionEx {

	public static void main(String[] args) {
		// ���� ó�� ����(try ~ catch(catch�� ������ ������ ����)
		System.out.println(1);
		
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
			System.out.println(2);
			System.out.println(3/0);		// ArithmeticException
			int[] arr2 = new int[-3];		// NegativeArraySizeException
			System.out.println(4);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(5);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(999);
		}
		
		System.out.println(6);
	}

}
