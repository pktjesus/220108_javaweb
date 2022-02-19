package ch14;

import java.util.*;

public class GenericSample1 {

	public static void main(String[] args) {
		// 제너릭을 사용하지 않는 케이스
		List list = new ArrayList();
		list.add(1);		//	-> int
		list.add("홍길동");	//  -> String
		
		int number1 = (int)list.get(0);  // 0은 인덱스번호
		String name = (String)list.get(1);  // 1은 인덱스번호
		
		System.out.println(number1 + " " + name);
		

		List<Map<String, Object>>
		// 제너릭을 사용하는 케이스
		List<String> list1 = new ArrayList();
		list1.add("홍길동");	// -> String
		// list1.add(1);		//	-> Compile error
		String name1 = list1.get(0);   // 0은 인덱스번호
	}
	
	public void swap(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
	public void swap(double n1, double n2) {
		double temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
	public void swap(long n1, long n2) {
		long temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
	public void swap(short n1, short n2) {
		short temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
	public void swap(Object n1, Object n2) {
		Object temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
//	public void swap(T n1, T n2) {
//		T temp = n1;
//		n1 = n2;
//		n2 = temp;
//	}

}
