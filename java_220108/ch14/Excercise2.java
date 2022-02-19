package ch14;

import java.util.ArrayList;
import java.util.List;

public class Excercise2 {

	public static void main(String[] args) {
		MemberEx me1 = new MemberEx("hong", "ȫ�浿", 30);
		MemberEx me2 = new MemberEx("lee", "�̼���", 40);
		MemberEx me3 = new MemberEx("kim", "������", 50);
		
		List<MemberEx> memberList = new ArrayList<MemberEx>();
		memberList.add(me1);
		memberList.add(me2);
		memberList.add(me3);
		
		// ��ü ȸ�� ���(for�� �̿�)
		// ������
		// hong,ȫ�浿,30
		// lee,�̼���,40
		// kim,������,50		
		for(int i = 0; i < memberList.size(); i++) {
			MemberEx me = memberList.get(i);
			System.out.println(me.getId() + "," + me.getName() + "," + me.getAge());
		}
	}

}

class MemberEx extends Object {
	String id;
	String name;
	int age;
	
	public MemberEx(String id, String name, int age) {
		super();		// �� �����ŵ� �������
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
