package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		List list = new ArrayList();
		// list ��ü�� ��� �߰�
		list.add(new Circle(3.0));
		list.add(new Rectangle(3, 4));
		list.add(new Circle(5));
		list.add(new Rectangle(5,6));
		
		System.out.println("��ü ������ ������ �� :" + sumArea(list));
		System.out.println("��ü ������ �ѷ��� �� :" + sumLength(list));
	}

	// List�� �ִ� ��� �������� ���� ���� ���ϴ� �Լ�(�޼ҵ�)
	private static double sumLength(List list) {
		double sumlength = 0;
		for (int i=0; i < list.size(); i++) {
			Shape s = (Shape)list.get(i);
			sumlength = sumlength + s.length();
		}
		
		return sumlength;
	}

	// List�� �ִ� ��� �������� ���� ���� ���ϴ� �Լ�(�޼ҵ�)
	private static double sumArea(List list) {
		double sumarea = 0;
		for (int i=0; i < list.size(); i++) {
			Shape s = (Shape)list.get(i);
			sumarea = sumarea + s.area();
		}
		
		return sumarea;
	}
}
