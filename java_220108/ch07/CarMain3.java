package ch07;

public class CarMain3 {

	public static void main(String[] args) {
		// Car Ÿ���� �迭��ü ����
		Car[] cars = new Car[3];

		// Car ��ü ����
		Car tico = new Car();
		tico.color = "ȭ��Ʈ";
		tico.company = "���";
		tico.type = "����";
		
		// ��� �ε����� tico��ü ����
		for (int i =0; i < cars.length; i++) {
			cars[i] = tico;		// shallow copy ����
		}
		System.out.println("2�� �ε��� color : " + cars[2].color);	//ȭ��Ʈ
		
		cars[0].color = "��";// 0�� �ε��� ��ü�� color �ʵ忡 "��" ����
		
		System.out.println("0�� �ε��� color : " + cars[0].color);	//��
		System.out.println("1�� �ε��� color : " + cars[1].color);	//��
		System.out.println("2�� �ε��� color : " + cars[2].color);	//��
	}

}
