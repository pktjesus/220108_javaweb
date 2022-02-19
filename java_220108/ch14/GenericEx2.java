package ch14;

public class GenericEx2 {

	public static void main(String[] args) {
		Generic<String> nogen = new Generic();
		String[] ss = {"홍길동","이순신","김유신"};
		
		// Object 타입의 매개변수에 String 배열객체 전달
		nogen.set(ss);
		nogen.print();	// 홍길동 이순신 김유신 
		
		String[] objs = nogen.get();
		for(String s : objs) {
			System.out.println(s);
		}
		///////////////////////////////////////////////////////////////////
		Integer[] ii = {1,2,3};
		
		// String 제네릭 타입의 매개변수에 Integer 배열객체 전달
		Generic<Integer> gen2 = new Generic<Integer>();
		gen2.set(ii);
		gen2.print();
		
		Integer[] iis = gen2.get();
		for(Integer o : iis) {
			System.out.println(o);
		}
	}
}

//class 클래스명<T> {
//	
//}
//
//interface 인터페이스명<T> {
//	
//}

class Generic<G> {
	G[] v;
	
	void set(G[] n) {
		v = n;
	}
	
	G[] get() {
		return v;
	}
	
	void print() {
		for(G o : v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}