package ch16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptionalNoElem {

	public static void main(String[] args) {
		// ��Ұ� ���� �� ArrayList ��ü ����
		List<Integer> list = new ArrayList<Integer>();
		
		long count = list.stream().count();
		System.out.println("��ҵ��� ���� : " + count);		// 0
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("��ҵ��� �� : " + sum);
		
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		// ��Ұ� �����ϴ� ���޸� ��� ���
		if(avg.isPresent())
			System.out.println("��ҵ��� ��� : " + avg.getAsDouble());
		
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("��ҵ� �� �ִ� �� : " + max);
		
		// ��Ұ� �����ϸ� ����
		list.stream().mapToInt(Integer::intValue)
			         .findFirst().ifPresent(a -> System.out.println("list ��� �� ù��° ��: " + a));
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.stream().mapToInt(Integer::intValue)
					  .findFirst().ifPresent(a -> System.out.println("list2 ��� �� ù��° ��: " + a));
	}

}
