package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		// ����Ʈ ��ü ����
		List<Integer> list = new ArrayList<Integer>();
		// ����Ʈ ��ü�� �� �߰�
		for(int i=1;i<=5;i++) {
			list.add(i);
		}
		// ListIterator ��ü ����
		ListIterator lit = list.listIterator();
		// ���� ��� �ݺ� ���
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println();
		// ���� ��� �ݺ� ���
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
