package ch08;

public class SmartPhoneMain {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.name = "��ȭ��";
		p.company = "����";
		p.color = "ȭ��Ʈ";
		
		System.out.println("Phone ���");
		System.out.println(p.name);
		System.out.println(p.company);
		System.out.println(p.color);
		p.call();
		p.receive();
		
		System.out.println();
		SmartPhone sp = new SmartPhone();
		sp.name = "������";
		sp.company = "�Ｚ";
		sp.color = "��";
		
		System.out.println("SmartPhone ���");
		System.out.println(sp.name);		// PhoneŬ������ �ִ� name
		System.out.println(sp.company);		// PhoneŬ������ �ִ� company
		System.out.println(sp.color);		// PhoneŬ������ �ִ� color
		sp.call();			// PhoneŬ������ �ִ� call�޼ҵ�
		sp.receive();		// PhoneŬ������ �ִ� receive�޼ҵ�
		sp.installApp();	// SmartPhoneŬ������ �ִ� installApp�޼ҵ�

	}

}
