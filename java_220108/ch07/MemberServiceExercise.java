package ch07;

public class MemberServiceExercise {
	public static void main(String args[]) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
// ����� ����(�Ʒ�)
// �α��� �Ǿ����ϴ�.
// �α׾ƿ� �Ǿ����ϴ�.
// id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.

// login : �Ű��� id�� hong, password�� 12345�� ��쿡�� true�� �����ϰ� �� �̿��� ���� false 
//   -> ���ϰ��� boolean, �Ű����� id(String), password(String)
// logout : �α׾ƿ� �Ǿ����ϴ�.��� ��� 
//   -> ���ϰ��� void, �Ű����� id(String)
class MemberService {
	// login, logout �޼ҵ� �ڵ� �ۼ�
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}