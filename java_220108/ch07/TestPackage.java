package ch07;

import test1.test2.test3.TestImport;	// 다른 패키지의 클래스들을 1개씩만 가져올 때 
import test1.test2.test3.*;				// 다른 패키지의 클래스들을 여러개 가져올 때

public class TestPackage {

	public static void main(String[] args) {
		Member a;		// 같은 패키지내에 있는 클래스들은 import없이 허용 가능
		test1.test2.test3.Member b;	// 다른 패키지에 있는 클래들은 import를 사용하거나 직접 패키지명을 입력하여 사용가능
		
		TestImport c = new TestImport();
		test1.test2.test3.TestImport d = new test1.test2.test3.TestImport();
		
		c.method();
		d.method();
		
		test1.test2.test3.TestPackage e = new test1.test2.test3.TestPackage();
		e.method();
	}
}
