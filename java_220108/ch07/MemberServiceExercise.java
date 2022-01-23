package ch07;

public class MemberServiceExercise {
	public static void main(String args[]) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
// 결과값 예시(아래)
// 로그인 되었습니다.
// 로그아웃 되었습니다.
// id 또는 password가 올바르지 않습니다.

// login : 매개값 id가 hong, password가 12345일 경우에만 true로 리턴하고 그 이외의 값은 false 
//   -> 리턴값은 boolean, 매개변수 id(String), password(String)
// logout : 로그아웃 되었습니다.라고 출력 
//   -> 리턴값은 void, 매개변수 id(String)
class MemberService {
	// login, logout 메소드 코드 작성
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}