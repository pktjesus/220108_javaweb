package ch09;

public class AnimalMain {

	public static void main(String[] args) {
		long l1 = 100000000000000L;
		int i1 = 0;
		
		i1 = (int)l1;	// ��������ȯ
		System.out.println("i1 -> " + i1);	// �ǵ����� ���� ���ڰ� ���
		////////////////////////////////////////////////////////////////
		int i2 = 23213123;
		long l2 = 0L;
		
		l2 = i2;	// �ڵ�����ȯ
		System.out.println("l2 -> " + l2);	// 23213123
		////////////////////////////////////////////////////////////////
		
		Animal eagle = new Eagle();
		eagle.sleep();
		//eagle.eat();
		
		Eagle eagleObj = (Eagle)eagle;		// ��������ȯ
		eagleObj.eat();
		eagleObj.fly();
	}

}
