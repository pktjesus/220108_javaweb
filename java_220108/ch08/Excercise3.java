package ch08;

public class Excercise3 {
	public static void main(String[] args) {
		
	}
}
// 아래 클래스들의 공통적인 속성을 가져와서 Character라는 부모 클래스 작성(자식 클래스에서는 공통적인 속성 제외)
class Character {
	int hp;
	int power;
	
	public void attack (Object target) {
		System.out.println("공격");
	}
}

class Warrior extends Character {
	int weapon;
	
	public void defence(Object target) {
		System.out.println("방어");
	}
}
class Gladiator extends Character {
	int shield;
	
	public void powerAttack(Object target) {
		System.out.println("파워공격");
	}
}
class Wizard extends Character {
	int heal;
	
	public void healing(Object target) {
		System.out.println("치료마법");
	}
}
