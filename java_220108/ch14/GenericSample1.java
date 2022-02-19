package ch14;

import java.util.*;

public class GenericSample1 {

	public static void main(String[] args) {
		// ���ʸ��� ������� �ʴ� ���̽�
		List list = new ArrayList();
		list.add(1);		//	-> int
		list.add("ȫ�浿");	//  -> String
		
		int number1 = (int)list.get(0);  // 0�� �ε�����ȣ
		String name = (String)list.get(1);  // 1�� �ε�����ȣ
		
		System.out.println(number1 + " " + name);
		

		List<Map<String, Object>>
		// ���ʸ��� ����ϴ� ���̽�
		List<String> list1 = new ArrayList();
		list1.add("ȫ�浿");	// -> String
		// list1.add(1);		//	-> Compile error
		String name1 = list1.get(0);   // 0�� �ε�����ȣ
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
