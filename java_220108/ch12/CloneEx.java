package ch12;

public class CloneEx {

	public static void main(String[] args) {
		String[] arr = {"홍길동", "이순신", "김유신", "안중근"};
		String[] arr2 = arr.clone();
		
		System.out.println(arr == arr2);		// false
		System.out.println(arr2.equals(arr));	// false
		for (String v : arr2) {
			System.out.println(v);
		}
		
		String[] arr3 = new String[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);		// clone메소드 내용과 같음
		
		System.out.println(arr == arr3);		// false
		for (String v : arr3) {
			System.out.println(v);
		}
	}
}
