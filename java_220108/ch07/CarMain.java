package ch07;

public class CarMain {

	public static void main(String[] args) {
		Car tico = new Car();
		Car pride = new Car();
		
		tico.color = "ȭ��Ʈ";
		tico.company = "���";
		tico.type = "����";
		
		pride.color = "����";
		pride.company = "���";
		pride.type = "����";
		
		tico.go();
		pride.go();
		System.out.println(tico.color);
		System.out.println(tico.company);
		System.out.println(tico.type);
		System.out.println(pride.color);
		System.out.println(pride.company);
		System.out.println(pride.type);
	}

}