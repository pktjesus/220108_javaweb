package ch10.InnerInter;

public class OuterInterface {
	interface InterfaceEx {		// ���� �������̽�
		void method();
	}

	InterfaceEx ie;
	
	void setInterfaceEx(InterfaceEx ie) {
		this.ie = ie;
	}
	void outerMethod() {
		ie.method();
	}
}
