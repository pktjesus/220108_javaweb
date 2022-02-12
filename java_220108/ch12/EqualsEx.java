package ch12;

public class EqualsEx {
	public static void main(String[] args) {
		Obj obj1 = new Obj(100);
		Obj obj2 = new Obj(100);
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1 ��ü�� obj2 ��ü�� ����");		
		} else {
			System.out.println("obj1 ��ü�� obj2 ��ü�� �ٸ�");	// ��µ�
		}
		
		Obj obj3 = obj1;
		if (obj1.equals(obj3)) {
			System.out.println("obj1 ��ü�� obj3 ��ü�� ����");	// ��µ�
		} else {
			System.out.println("obj1 ��ü�� obj3 ��ü�� �ٸ�");
		}
		
		ObjOverride objo1 = new ObjOverride(100);
		ObjOverride objo2 = new ObjOverride(100);
		
		if (objo1.equals(objo2)) {
			System.out.println("objo1 ��ü�� objo2 ��ü�� ����");	// ��µ�
		} else {
			System.out.println("objo1 ��ü�� objo2 ��ü�� �ٸ�");
		}
		
		ObjOverride objo3 = objo1;
		if (objo1.equals(objo3)) {
			System.out.println("objo1 ��ü�� objo1 ��ü�� ����");	// ��µ�
		} else {
			System.out.println("objo1 ��ü�� objo3 ��ü�� �ٸ�");	
		}
	}
}

class Obj {
	int obj_var;
	Obj(int obj_var) {
		this.obj_var = obj_var;
	}
}

class ObjOverride {
	int obj_var;
	ObjOverride(int obj_var) {
		this.obj_var = obj_var;
	}
	@Override
	public boolean equals(Object obj) {
		//return false;
		if (obj instanceof ObjOverride) {
			return true;
		} else {
			return false;
		}
    }
}