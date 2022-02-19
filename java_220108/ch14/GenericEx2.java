package ch14;

public class GenericEx2 {

	public static void main(String[] args) {
		Generic<String> nogen = new Generic();
		String[] ss = {"ȫ�浿","�̼���","������"};
		
		// Object Ÿ���� �Ű������� String �迭��ü ����
		nogen.set(ss);
		nogen.print();	// ȫ�浿 �̼��� ������ 
		
		String[] objs = nogen.get();
		for(String s : objs) {
			System.out.println(s);
		}
		///////////////////////////////////////////////////////////////////
		Integer[] ii = {1,2,3};
		
		// String ���׸� Ÿ���� �Ű������� Integer �迭��ü ����
		Generic<Integer> gen2 = new Generic<Integer>();
		gen2.set(ii);
		gen2.print();
		
		Integer[] iis = gen2.get();
		for(Integer o : iis) {
			System.out.println(o);
		}
	}
}

//class Ŭ������<T> {
//	
//}
//
//interface �������̽���<T> {
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