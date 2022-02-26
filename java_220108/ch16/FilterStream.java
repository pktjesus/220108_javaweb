package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStream {

	public static void main(String[] args) {
		// List ��ü ����
		List<String> list = Arrays.asList("ȫ�浿", "������", "ȫ�浿", "�̼���", "ȫ�浿", "������");
		
		// distinct() �޼���� �ߺ� ���� �� ���� �ݺ��ڷ� ���
		System.out.println("distinct()");
		list.stream().distinct().forEach(s -> System.out.println(s)); // ȫ�浿 ������ �̼��� ������
	
		// "ȫ"���� �����ϴ� ���ڿ� Ȥ�� "��"���� �����ϴ� ���ڿ��� ���͸� �� ���� �ݺ��ڷ� ���
		System.out.println("filter()");
		list.stream().filter(n -> n.startsWith("ȫ") || n.startsWith("��"))
					.forEach(n -> System.out.println(n));
		System.out.println();	// ȫ�浿 ������ ȫ�浿 ȫ�浿
		
		// �ߺ����� �� "ȫ"���� �����ϴ� ���ڿ� ���� �ݺ��ڷ� ���
		System.out.println("distinct() + filter()");
		list.stream().distinct().filter(n -> n.startsWith("ȫ")).forEach(n -> System.out.println(n));	// ȫ�浿
		list.stream().filter(n -> n.startsWith("ȫ")).distinct().forEach(n -> System.out.println(n));	// ȫ�浿
	}

}
