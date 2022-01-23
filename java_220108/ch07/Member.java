package ch07;

// 클래스를 생성
// 클래스 이름 작성 규칙
// 1 : 하나 이상의 문자로 이루어져야 한다. ex) Car, SportsCar
// 2 : 첫번째 글자는 숫자와 소문자가 올 수 없다.  ex) Car(o), 3Car(x)
// 3 : '$','_'외의 특수문자는 사용할 수 없다.  ex) $Car(o), _Car(o), @Car(x), #Car(x)
// 4 : 자바 키워드는 사용할 수 없다. ex) int(x), for(x)
public class Member {
	int i = 0;	// 필드(멤버변수)
	int j = 0;	// 필드(멤버변수)
	
	public Member() {	// 기본생성자(리턴값이 없음)
		System.out.println("기본생성자 출력");
	}
	
	public void test1() {
		System.out.println("test1 메소드 출력 -> i " + i);
		System.out.println("test1 메소드 출력 -> j " + j);
	}
}
