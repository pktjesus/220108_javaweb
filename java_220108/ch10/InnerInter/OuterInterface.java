package ch10.InnerInter;

public class OuterInterface {
	interface InterfaceEx {		// 내부 인터페이스
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
