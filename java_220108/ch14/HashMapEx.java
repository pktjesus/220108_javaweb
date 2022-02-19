package ch14;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Object> hm = new HashMap<String, Object>();
		hm.put("name", "ȫ�浿");
		hm.put("id", "hong");
		hm.put("age", 30);
		
		System.out.println(hm.get("name"));		// ȫ�浿
		System.out.println(hm.get("id"));		// hong
		System.out.println(hm.get("age"));		// 30
	}

}
