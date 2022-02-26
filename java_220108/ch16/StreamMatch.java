package ch16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMatch {
	public static void main(String[] args) {
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		// ��� ��ҵ��� Shape�� �ν��Ͻ�(��ü)���� ���� ��(��ΰ� and ������ ����� true�� �� true�� ����)
		boolean result = list.stream().allMatch(a -> (a instanceof Shape));	
		System.out.println("��� ��Ҵ� Shape�� ��ü�̴�. -> " + result);
		
		// ��ҵ� �� �ϳ��̻��� Rectangle ��ü���� ���� ��(or �������� ����� true�� �� true�� ����)
		boolean result2 = list.stream().anyMatch(a -> (a instanceof Rectangle));
		System.out.println("��� �� Rectangle�� ��ü�� �����Ѵ�. -> " + result2);
		
		// ��� ��Ұ� Circle�� ��ü���� ���ǿ� �ش����� �ʴ��� ��(��ΰ� and ������ ����� false�� �� true�� ����)
		boolean result3 = list.stream().noneMatch(a -> (a instanceof Circle));
		System.out.println("��� ��� �� Circle�� ��ü�� �������� �ʴ´�. -> " + result3);
	}
}
