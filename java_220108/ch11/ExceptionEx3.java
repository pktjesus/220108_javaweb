package ch11;

public class ExceptionEx3 {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int[] arr = {1,2,3};
		
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
			System.out.println(arr[2]);
			System.out.println(j / i);
			Integer.parseInt("a");
			
			// catch���� ��ġ ������ �ڽ� exception�������� �����Ͽ� �θ� exception���� ��ġ
		} catch (ArithmeticException e) {				// �ڽ�
			e.printStackTrace();
			System.out.println("0���� ���� �� ����");
		} catch (ArrayIndexOutOfBoundsException e) {	// �ڽ�
			e.printStackTrace();
			System.out.println("�ε��� ���� �ʰ�");
		} catch (NumberFormatException e) {	// �ڽ�
			e.printStackTrace();
			System.out.println("���ڰ� �ƴ�");
		} catch (Exception e) {				// �θ�
			e.printStackTrace();
			System.out.println("���� �߻�");			
		}
	}
}
