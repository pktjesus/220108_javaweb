package ch16;

import java.util.stream.Stream;

public class StreamByGenerator {

	public static void main(String[] args) {
		// generate() �޼���� Stream ��ü ����
		// ����Ʈ 10�� ����
		Stream<String> stream = Stream.generate(() -> "�ֱ���").limit(10);
		// ���� �ݺ��ڷ� ���
		stream.forEach(s -> System.out.println(s));
	}

}
