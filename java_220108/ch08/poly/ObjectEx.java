package ch08.poly;

public class ObjectEx {
	public static void main(String[] args) {
		allObject(new GraphicCard());
		allObject(new Amd());
		allObject(new Nvidia());
		allObject("������Ʈ��");
	}

	public static void allObject(Object obj) {
		System.out.println(obj.toString());
	}
}
