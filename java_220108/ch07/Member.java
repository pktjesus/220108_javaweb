package ch07;

// Ŭ������ ����
// Ŭ���� �̸� �ۼ� ��Ģ
// 1 : �ϳ� �̻��� ���ڷ� �̷������ �Ѵ�. ex) Car, SportsCar
// 2 : ù��° ���ڴ� ���ڿ� �ҹ��ڰ� �� �� ����.  ex) Car(o), 3Car(x)
// 3 : '$','_'���� Ư�����ڴ� ����� �� ����.  ex) $Car(o), _Car(o), @Car(x), #Car(x)
// 4 : �ڹ� Ű����� ����� �� ����. ex) int(x), for(x)
public class Member {
	int i = 0;	// �ʵ�(�������)
	int j = 0;	// �ʵ�(�������)
	
	public Member() {	// �⺻������(���ϰ��� ����)
		System.out.println("�⺻������ ���");
	}
	
	public void test1() {
		System.out.println("test1 �޼ҵ� ��� -> i " + i);
		System.out.println("test1 �޼ҵ� ��� -> j " + j);
	}
}
