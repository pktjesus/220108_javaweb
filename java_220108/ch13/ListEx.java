package ch13;

import java.util.List;
import java.util.ArrayList;

public class ListEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		// list객체에 요소 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		for(int i=0; i < list.size(); i++) {
			System.out.println("index : " + i + ", value : " + list.get(i));
		}
	}

}
