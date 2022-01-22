package ch06;

import java.util.Arrays;

public class ReferenceType4 {

	public static void main(String[] args) {
		// �迭 ���� ����
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		System.out.println("arr1 == arr2 : " + (arr1 == arr2));	  		  // �迭�� ��ġ���� �޶� false
		System.out.println("arr1.equals(arr2) : " + (arr1.equals(arr2))); // �迭�� equals�� ��ġ�� ������ ��false	

		int[] arr3 = arr1;		// arr1�� ��ġ(pointer�� ��ġ)�� arr3�� ���� -> ���� ����(shallow copy)
		System.out.println("arr1 == arr3 : " + (arr1 == arr3));	// true
		
		arr3[0] = 4;
		System.out.println("arr1[0] : " + arr1[0]);		// 4
		System.out.println("arr3[0] : " + arr3[0]);		// 4

		System.out.println();
		///////////////////////////////////////////////////////////////////////////////////
		// �迭 ���� ����
		int[] arr4 = {1,2,3};
		int[] arr5 = Arrays.copyOf(arr4, 3);	// arr4�� ���� arr5�迭�� ���� -> ���� ����(deep copy)	
		
		arr5[0] = 4;
		System.out.println("arr4[0] : "+arr4[0]);	// 1
		System.out.println("arr5[0] : "+arr5[0]);	// 4
	}
}
