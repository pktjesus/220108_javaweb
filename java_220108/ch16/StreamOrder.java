package ch16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("ȫ�浿", "������", "�̼���", "������");
		
		System.out.println("�⺻ ����");
		//list.stream().sorted().forEach(s -> System.out.println(s));	// �Լ��� �������̽� �⺻ ���
		list.stream().sorted().forEach(System.out::println);		// �޼ҵ� ���� ���
		System.out.println();
		
		System.out.println("���� ����");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
