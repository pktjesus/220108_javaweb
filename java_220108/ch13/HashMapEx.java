package ch13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;

public class HashMapEx {
	public static void main(String[] args) {
		// Map 객체 생성(중복된 key가 들어갈 수 없음, 중복된 value(값)은 들어갈 수 있음)
		Map map = new HashMap();
		Map 유저주문정보들 = new HashMap<Long, String>();		// Long -> 회원번호, String -> 상품명 
		
		// 이름이 담긴 문자열 배열 생성
		String[] names = {"홍길동", "김유신", "이순신", "강감찬", "김유신"};
		// 숫자가 담긴 정수 배열 생성
		int[] nums = {1234,4567,2350,9870,2345};
		
		// Map 객체에 두 배열의 값들을 키와 밸류 쌍으로 저장
		for(int i=0;i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		
		// 출력
		System.out.println(map);
		System.out.println("홍길동 번호 :" + map.get("홍길동"));		// 1234
		System.out.println("이순신 번호 :" + map.get("이순신"));		// 2350
		System.out.println("김유신 번호 :" + map.get("김유신"));		// 4567(x) -> 2345(o)
		
		System.out.println("////////////////////////////////////////////////////////////////////////////////////");
		//Map 객체에서 key 들만 조회하기
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + map.get(key));
		}
		System.out.println("Iterator로 출력");
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			String a = (String)it.next();
			System.out.println(a+"="+map.get(a));
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////");
		//Map 객체에서 value 들만 조회하기
		Collection values = map.values();
		// 향상된 for문으로 출력
		for(Object i : values) {
			System.out.println(i);
		}
		// Iterator 객체로 출력
		Iterator it1 = values.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////");
		// Map 객체는 (키,값) 쌍으로 이루어진 객체들의 모임
		// (키, 값) 쌍으로  조회하기
		Set entry = map.entrySet();
		for(Object o : entry) {
			Map.Entry m = (Map.Entry)o;
			System.out.println("key:"+m.getKey() + ", value:" + m.getValue());
		}
	}
}
