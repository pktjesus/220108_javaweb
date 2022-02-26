package ch16;

import java.util.stream.Stream;

public class StreamByIterator {

	public static void main(String[] args) {
		// iterator() �޼���� Stream ��ü ����
		// ����Ʈ 10�� ����
		Stream<Integer> stream = Stream.iterate(1, n -> n + 2).limit(10);
		// ���� �ݺ��ڷ� ���
		stream.forEach(s -> System.out.println(s));
	}

}
