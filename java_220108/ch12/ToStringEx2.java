package ch12;

public class ToStringEx2 {
	public static void main(String[] args) {
		Fruit2 f = new Fruit2("���", "����");
		System.out.println(f);
	}
}

class Fruit2 extends Object {
	String name;
	String color;
	public Fruit2(String name, String color) {
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "���� �̸� : "+this.name+"\n���� ���� : "+this.color;
	}
}
