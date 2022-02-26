package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamMap {

	// ������ �ٷ� �����ϰ� Ȯ���� ������ ����Ʈ�� ����
	// https://blog.gaerae.com/2015/06/website-run-execute-code-online.html
	public static void main(String[] args) {
		List<String> list = Arrays.asList("���ع���", "��λ���", 
				"������ �⵵��");

		System.out.println("�Լ��� �������̽� ���");
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));// 4 4 7
		System.out.println();
		
		System.out.println("�޼��� ���� ���");
		list.stream().mapToInt(String::length).forEach(len -> System.out.println(len));	// 4 4 7
		
		/////////////////////////////////////////////////////////////////////////////////////
		int intArr[] = {10,20,30,40,50,60};
		
		// doubleŸ���� ��Ҹ� ���� DoubleStream���� ����ȯ
		Arrays.stream(intArr).asDoubleStream().forEach(d -> System.out.println(d));
		System.out.println();
		
		// intŸ���� ��Ҹ� ���� Stream<Integer>���� ����ȯ
		Arrays.stream(intArr).boxed().forEach(i -> System.out.println(i.getClass()));
		
		
	}

}
