package ch13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;

public class HashMapEx {
	public static void main(String[] args) {
		// Map ��ü ����(�ߺ��� key�� �� �� ����, �ߺ��� value(��)�� �� �� ����)
		Map map = new HashMap();
		Map �����ֹ������� = new HashMap<Long, String>();		// Long -> ȸ����ȣ, String -> ��ǰ�� 
		
		// �̸��� ��� ���ڿ� �迭 ����
		String[] names = {"ȫ�浿", "������", "�̼���", "������", "������"};
		// ���ڰ� ��� ���� �迭 ����
		int[] nums = {1234,4567,2350,9870,2345};
		
		// Map ��ü�� �� �迭�� ������ Ű�� ��� ������ ����
		for(int i=0;i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		
		// ���
		System.out.println(map);
		System.out.println("ȫ�浿 ��ȣ :" + map.get("ȫ�浿"));		// 1234
		System.out.println("�̼��� ��ȣ :" + map.get("�̼���"));		// 2350
		System.out.println("������ ��ȣ :" + map.get("������"));		// 4567(x) -> 2345(o)
		
		System.out.println("////////////////////////////////////////////////////////////////////////////////////");
		//Map ��ü���� key �鸸 ��ȸ�ϱ�
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + map.get(key));
		}
		System.out.println("Iterator�� ���");
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			String a = (String)it.next();
			System.out.println(a+"="+map.get(a));
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////");
		//Map ��ü���� value �鸸 ��ȸ�ϱ�
		Collection values = map.values();
		// ���� for������ ���
		for(Object i : values) {
			System.out.println(i);
		}
		// Iterator ��ü�� ���
		Iterator it1 = values.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////");
		// Map ��ü�� (Ű,��) ������ �̷���� ��ü���� ����
		// (Ű, ��) ������  ��ȸ�ϱ�
		Set entry = map.entrySet();
		for(Object o : entry) {
			Map.Entry m = (Map.Entry)o;
			System.out.println("key:"+m.getKey() + ", value:" + m.getValue());
		}
	}
}
