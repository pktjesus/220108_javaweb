package ch14;

import java.util.ArrayList;
import java.util.List;

public class MemberNoGeneric {
	public static void main(String[] args) {
		// ���׸��� ������� ���� ���
		List list = new ArrayList();
		
		Member mem1 = new Member();
		mem1.setName("ȫ�浿");
		mem1.setId("hong");
		mem1.setPassword("hong1234");
		mem1.setAge(40);
	
		list.add(mem1); // ����Ʈ�� �߰�
		
		Member mem2 = new Member();
		mem2.setName("�̼���");
		mem2.setId("lee");
		mem2.setPassword("lee1234");
		mem2.setAge(50);
		
		list.add(mem2); // ����Ʈ�� �߰�
		
		Member mem3 = new Member();
		mem3.setName("������");
		mem3.setId("kim");
		mem3.setPassword("kim1234");
		mem3.setAge(60);
		
		list.add(mem3); // ����Ʈ�� �߰�
		
		// ����Ʈ ����
		System.out.println("list.size() : "+list.size());	// list.size() : 3
		
		// ��� ����Ʈ�� ���(Member) ��������ȯ �� ���
		for (int i=0; i<list.size(); i++) {
			System.out.println("�ε��� : "+i
					+", �̸� : "+((Member)list.get(i)).getName()
					+", ���̵� : "+((Member)list.get(i)).getId()
					+", ��й�ȣ : "+((Member)list.get(i)).getPassword()
					+", ���� : "+((Member)list.get(i)).getAge());
		}
	}
}
