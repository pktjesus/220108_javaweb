package ch07.test.test2;

import ch07.ClassA;
import test1.test2.test3.TestPackage;

public class ClassC {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.print();		// public 메소드여서 호출이 가능. protected, private 혹은 default일 때는 호출 불가능
		
		//ClassB cb = new ClassB();	// 다른 패키지에 있으며 접근제한자가 default여서 객체생성이 불가능
		
		TestPackage tp = new TestPackage();
		tp.method();	// public여서 접근 가능
		//tp.method1();	// private여서 에러
		//tp.method2();	// protected여서 에러
		//tp.method3();	// default여서 에러
		
	}

}
