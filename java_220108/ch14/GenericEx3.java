package ch14;

public class GenericEx3 {

	public static void main(String[] args) {
		Generic2<String, Integer> gen1 = new Generic2<String, Integer>();
		gen1.set("ȫ�浿", 1111);
		// gen1.set("�̼���", "A111"); // ������ ����
		
		System.out.println("<String, Integer>");
		System.out.println("name : "+gen1.getName());
		System.out.println("id : "+gen1.getId());
		
		Generic2<String, String> gen2 = new Generic2<String, String>();
		gen2.set("�̼���", "A1111");
		System.out.println("<String, String>");
		System.out.println("name : "+gen2.getName());
		System.out.println("id : "+gen2.getId());
	}
}

class Generic2<K, V> {
	K name;
	V id;
	
	void set(K name, V id) {
		this.name = name;
		this.id = id;
	}
	
	K getName() {
		return name;
	}
	
	V getId() {
		return id;
	}
}