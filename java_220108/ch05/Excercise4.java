package ch05;

public class Excercise4 {

	public static void main(String[] args) {
		System.out.println("*");		// ���ڿ��� ����ϰ� ���� �������� �Ѿ
		System.out.print("*");		// ���ڿ��� ����ϰ� ���� �������� �Ѿ�� ����.
		
		System.out.println();System.out.println();
		
		System.out.print("*");		// ���ڿ��� ����ϰ� ���� �������� �Ѿ�� ����.
		System.out.println("*");	// ���ڿ��� ����ϰ� ���� �������� �Ѿ
		
		System.out.println();
		// ���� for���� �̿��Ͽ� �Ʒ��� ���� ���� ����� ��µǵ��� �ڵ� �ۼ�
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println();
		// ���� for���� �̿��Ͽ� �Ʒ��� ���� ���� ����� ��µǵ��� �ڵ� �ۼ�
		// *****
		// ****
		// ***		
		// **		
		// *		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println();
		// ���� for���� �̿��Ͽ� �Ʒ��� ���� ���� ����� ��µǵ��� �ڵ� �ۼ�
		//     *
		//    ***
		//   *****		
		//  *******		
		// *********
		for (int i = 1; i <= 25; i++) {
			for (int j = 25 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i*2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
