package ch08;

public class Excercise3 {
	public static void main(String[] args) {
		
	}
}
// �Ʒ� Ŭ�������� �������� �Ӽ��� �����ͼ� Character��� �θ� Ŭ���� �ۼ�(�ڽ� Ŭ���������� �������� �Ӽ� ����)
class Character {
	int hp;
	int power;
	
	public void attack (Object target) {
		System.out.println("����");
	}
}

class Warrior extends Character {
	int weapon;
	
	public void defence(Object target) {
		System.out.println("���");
	}
}
class Gladiator extends Character {
	int shield;
	
	public void powerAttack(Object target) {
		System.out.println("�Ŀ�����");
	}
}
class Wizard extends Character {
	int heal;
	
	public void healing(Object target) {
		System.out.println("ġ�Ḷ��");
	}
}
