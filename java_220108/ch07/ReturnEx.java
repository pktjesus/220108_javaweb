package ch07;

public class ReturnEx {
	public static void main(String[] args) {
		Return obj = new Return();
		
		String name = obj.getName();
		int age = obj.getAge();
		
		System.out.println(name);			// ȫ�浿
		System.out.println(age);			// 30
		System.out.println(obj.getName());	// ȫ�浿
		System.out.println(obj.getAge());	// 30
	}
}

class Return {
	String getName() {
		return "ȫ�浿";
	}
	
	int getAge() {
		return 30;
	}
}