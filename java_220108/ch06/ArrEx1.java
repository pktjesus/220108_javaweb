package ch06;

public class ArrEx1 {

	public static void main(String[] args) {
		// 6.1 �迭����
		int i1 = 1;
		int i2 = 2;
		int i3 = 3;

		int[] arrInt;		
		int arrInt2[] = null;
		
		// System.out.println(arrInt[0]);	// CompileTime ���� �߻� -> �ʱⰪ�� ������� �ʾұ� ����
		//System.out.println(arrInt2[0]);		// RunTime NullPointerException
		
		int[] arrInt3 = new int[5];			// 5���� �ε����� ���� ���� �迭(�ʱⰪ�� 0)
		System.out.println("arrInt3[0] : " + arrInt3[0]);		// 0
		
		arrInt3[0] = 10;			// 10
		arrInt3[1] = 15;			// 15
		System.out.println("arrInt3[0] : " + arrInt3[0]);
		System.out.println("arrInt3[1] : " + arrInt3[1]);
		// System.out.println("arrInt3[5] : " + arrInt3[5]);		// RunTime ArrayIndexOutOfBoundsException
		
		int[] arrInt4 = {45, 55, 89};		// 3���� �ε����� ���� ���� �迭(����� ���� �ʱⰪ)
		System.out.println("arrInt4[0] : " + arrInt4[0]);		// 45
		System.out.println("arrInt4[1] : " + arrInt4[1]);		// 55
		System.out.println("arrInt4[3] : " + arrInt4[3]);		// RunTime ArrayIndexOutOfBoundsException
	}

}
