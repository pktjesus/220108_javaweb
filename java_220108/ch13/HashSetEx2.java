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
		
		// Member ��ü �ΰ� �߰�(����� ���� Ŭ����)
		// set�� equals�� true�̰� ���� hashCode�� �϶� �ߺ����� �ν�
		Member m1 = new Member(1, "ȫ�浿", 40);
		Member m2 = new Member(2, "ȫ�浿", 40);
		System.out.println("m1�� �ؽ��ڵ� : " + m1.hashCode());		
		System.out.println("m2�� �ؽ��ڵ� : " + m2.hashCode());
		System.out.println(set.add(m1));		// true
		System.out.println(set.add(m2));		// 
		
		// ���
		System.out.println(set);	// abc, [ȫ�浿,40], [��浿,40]
	}

}
