package ch16;

import java.util.stream.Stream;

public class StreamByBuilder {

	public static void main(String[] args) {
		// stream�� ��ü ������ �����ϱ� -> builder�޼ҵ�� Builder��ü ����
		// �޼ҵ� ü�̴� ��� ���
		Stream stream = Stream.builder()
						   .add("����ȭ")
						   .add("��õ��")
						   .add("ȭ������")
						   .add("���ѻ��")
						   .build();		
		stream.forEach(s -> System.out.println(s));		// ���η� ���
		//stream.forEach(s -> System.out.print(s + " "));	// ���η� ���
	}
}
