package ch12;

public class HashCodeEx {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println("str1.hashCode():"+str1.hashCode()) ;
		System.out.println("str2.hashCode():"+str2.hashCode()) ;
		System.out.println("System.identityHashCode(str1):" + System.identityHashCode(str1)) ;
		System.out.println("System.identityHashCode(str2):" + System.identityHashCode(str2)) ;


		Obj1 obj1 = new Obj1(100);
		Obj1 obj2 = new Obj1(100);
		System.out.println("obj1.hashCode():"+obj1.hashCode()) ;
		System.out.println("obj2.hashCode():"+obj2.hashCode()) ;
	}

}

class Obj1 {
	int obj_var;
	Obj1(int obj_var) {
		this.obj_var = obj_var;
	}
}