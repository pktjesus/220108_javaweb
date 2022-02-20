package ch13;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		// HashSet 객체 생성
		Set set = new HashSet();
		// 문자열 객체 두개 추가
		System.out.println(set.add(new String("abc")));		// true
		System.out.println(set.add(new String("abc")));		// false
		System.out.println(set.add("abc"));		// false
		
		// 출력
		System.out.println(set);	// abc
	}

}
