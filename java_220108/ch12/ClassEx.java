package ch12;

import java.lang.reflect.Method;

public class ClassEx {

	public static void main(String[] args) {
		EnvEx env = new EnvEx();
		
		// 객체를 이용해서 생성
		Class c1 = env.getClass();
		System.out.println(c1.getName());		// ch12.EnvEx
		
		// 문자열 주소로 생성
		try {
			Class c2 = Class.forName("ch12.EnvEx");
			System.out.println(c2.getName());	// ch12.EnvEx
			Method[] methods = c2.getMethods();
			System.out.println(methods[0].getName());	// test1
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
