package ch06;

import java.util.Arrays;

public class ReferenceType4 {

	public static void main(String[] args) {
		// 배열 변수 생성
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		System.out.println("arr1 == arr2 : " + (arr1 == arr2));	  		  // 배열의 위치값이 달라서 false
		System.out.println("arr1.equals(arr2) : " + (arr1.equals(arr2))); // 배열의 equals는 위치를 가지고 비교false	

		int[] arr3 = arr1;		// arr1의 위치(pointer의 위치)를 arr3에 대입 -> 얕은 복사(shallow copy)
		System.out.println("arr1 == arr3 : " + (arr1 == arr3));	// true
		
		arr3[0] = 4;
		System.out.println("arr1[0] : " + arr1[0]);		// 4
		System.out.println("arr3[0] : " + arr3[0]);		// 4

		System.out.println();
		///////////////////////////////////////////////////////////////////////////////////
		// 배열 변수 생성
		int[] arr4 = {1,2,3};
		int[] arr5 = Arrays.copyOf(arr4, 3);	// arr4의 값을 arr5배열에 복사 -> 깊은 복사(deep copy)	
		
		arr5[0] = 4;
		System.out.println("arr4[0] : "+arr4[0]);	// 1
		System.out.println("arr5[0] : "+arr5[0]);	// 4
	}
}
