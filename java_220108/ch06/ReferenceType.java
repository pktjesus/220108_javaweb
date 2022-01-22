package ch06;

public class ReferenceType {

	public static void main(String[] args) {
		String name1 = "홍길동";		// 기본자료형
		String name2 = "홍길동";		// 기본자료형
		
		System.out.println(name1 == name2);		// 기본자료형처럼 비교 -> true
		System.out.println(name1);		
		System.out.println(name2);		
		
		System.out.println();
		////////////////////////////////////////////////////////////////////////////////////
		String name1_ref = new String("홍길동");
		String name2_ref = new String("홍길동");
		
		System.out.println(name1_ref == name2_ref);		// 실제 참조자료형으로 위치 비교 -> false;
		System.out.println(name1_ref);
		System.out.println(name2_ref);
		
		System.out.println();
		////////////////////////////////////////////////////////////////////////////////////
		// String으로 같다 다르다를 비교를 할 때에는 equals함수를 사용하도록 한다.
		System.out.println(name1.equals(name2));		// String의 값을 가지고 비교 -> true
		System.out.println(name1_ref.equals(name2_ref));// String의 값을 가지고 비교 -> true
		
//		name1 = null;		// 위치 및 값이 존재하지 않음
//		name2 = null;		// 위치 및 값이 존재하지 않음
//		System.out.println(name1.equals(name2));		// true아니고 false아니고 오류코드(null 코드 오류(NullPointerException))
		
		name1_ref = "";		// 위치는 존재하나 값이 존재하지 않음 empty
		name2_ref = null;		// 위치 및 값이 존재하지 않음
		System.out.println(name1_ref.equals(name2_ref));// true아니고 false아니고 오류코드(null 코드 오류(NullPointerException))
		
		// char -> String
		// int -> Integer
		// long -> Long
	}
}
