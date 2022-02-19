package ch14;

// ���ʸ��� ���� �ʴ� ���̽�
public class GenericEx {
	public static void main(String[] args) {
		NoGeneric nogen = new NoGeneric();
		String[] ss = {"ȫ�浿","�̼���","������"};
		
		// Object Ÿ���� �Ű������� String �迭��ü ����
		nogen.set(ss);
		nogen.print();	// ȫ�浿 �̼��� ������ 
		
		Object[] objs = nogen.get();
		for(Object o : objs) {
			String s = (String)o; // String���� ��������ȯ
			System.out.println(s);
		}
		/////////////////////////////////////////////////////////////////////////////
		Integer[] ii = {1,2,3};
		
		nogen.set(ss);
		objs = nogen.get();
		for(Object o : objs) {
			String s = (String)o; // String���� ��������ȯ(runtime �����߻�)
			System.out.println(s);
		}
	}
}

class NoGeneric {
	Object[] v;
	
	void set(Object[] n) {
		v = n;
	}
	
	Object[] get() {
		return v;
	}
	
	void print() {
		for(Object o : v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}