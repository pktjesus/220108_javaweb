package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		List list = new ArrayList();
		// list 객체에 요소 추가
		list.add(new Circle(3.0));
		list.add(new Rectangle(3, 4));
		list.add(new Circle(5));
		list.add(new Rectangle(5,6));
		
		System.out.println("전체 도형의 면적의 합 :" + sumArea(list));
		System.out.println("전체 도형의 둘레의 합 :" + sumLength(list));
	}

	// List에 있는 모든 도형들의 길이 값을 더하는 함수(메소드)
	private static double sumLength(List list) {
		double sumlength = 0;
		for (int i=0; i < list.size(); i++) {
			Shape s = (Shape)list.get(i);
			sumlength = sumlength + s.length();
		}
		
		return sumlength;
	}

	// List에 있는 모든 도형들의 면적 값을 더하는 함수(메소드)
	private static double sumArea(List list) {
		double sumarea = 0;
		for (int i=0; i < list.size(); i++) {
			Shape s = (Shape)list.get(i);
			sumarea = sumarea + s.area();
		}
		
		return sumarea;
	}
}
