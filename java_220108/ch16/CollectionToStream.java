package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionToStream {

	public static void main(String[] args) {
		// ���ڿ� �迭�� �÷��������ӿ�ũ List�� ��ȯ
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		// List ��ü�� stream()�޼��带 �̿��� Stream ��ü�� ����
		Stream<String> stream = list.stream();
		// ���ιݺ��ڸ� �̿��� ���
		stream.forEach(s -> System.out.println(s));

	}

}
