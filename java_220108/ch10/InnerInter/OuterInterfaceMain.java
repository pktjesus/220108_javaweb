package ch10.InnerInter;

public class OuterInterfaceMain {
	public static void main(String[] args) {
		OuterInterface outInter = new OuterInterface();

		outInter.setInterfaceEx(new InterfaceImple());
		outInter.outerMethod();		// ie.method() -> InterfaceImple method() 호출
		outInter.setInterfaceEx(new InterfaceImple2());
		outInter.outerMethod();		// ie.method() -> InterfaceImple2 method() 호출
	}
}
