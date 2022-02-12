package ch12;

public class EqualsEx {
	public static void main(String[] args) {
		Obj obj1 = new Obj(100);
		Obj obj2 = new Obj(100);
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1 °´Ã¼¿Í obj2 °´Ã¼´Â °°À½");		
		} else {
			System.out.println("obj1 °´Ã¼¿Í obj2 °´Ã¼´Â ´Ù¸§");	// Ãâ·ÂµÊ
		}
		
		Obj obj3 = obj1;
		if (obj1.equals(obj3)) {
			System.out.println("obj1 °´Ã¼¿Í obj3 °´Ã¼´Â °°À½");	// Ãâ·ÂµÊ
		} else {
			System.out.println("obj1 °´Ã¼¿Í obj3 °´Ã¼´Â ´Ù¸§");
		}
		
		ObjOverride objo1 = new ObjOverride(100);
		ObjOverride objo2 = new ObjOverride(100);
		
		if (objo1.equals(objo2)) {
			System.out.println("objo1 °´Ã¼¿Í objo2 °´Ã¼´Â °°À½");	// Ãâ·ÂµÊ
		} else {
			System.out.println("objo1 °´Ã¼¿Í objo2 °´Ã¼´Â ´Ù¸§");
		}
		
		ObjOverride objo3 = objo1;
		if (objo1.equals(objo3)) {
			System.out.println("objo1 °´Ã¼¿Í objo1 °´Ã¼´Â °°À½");	// Ãâ·ÂµÊ
		} else {
			System.out.println("objo1 °´Ã¼¿Í objo3 °´Ã¼´Â ´Ù¸§");	
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
