package ch13;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		// HashSet ��ü ����
		Set set = new HashSet();
		// ���ڿ� ��ü �ΰ� �߰�
		System.out.println(set.add(new String("abc")));		// true
		System.out.println(set.add(new String("abc")));		// false
		System.out.println(set.add("abc"));		// false
		
		// ���
		System.out.println(set);	// abc
	}

}
