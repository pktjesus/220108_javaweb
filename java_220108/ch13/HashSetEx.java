package ch13;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// ObjectŸ���� �迭 ����
		Object[] arr = {"ȫ�浿","�̼���","ȫ�浿","�̼���",1,2,"1","2",1};
		
		// HashSet ��ü ����
		Set set = new HashSet();
		// set��ü�� �迭�� ��� ��� add
		for(int i=0;i < arr.length; i++) {
			System.out.println(set.add(arr[i]));
		}
		// ���
		System.out.println(set);
	}
}
