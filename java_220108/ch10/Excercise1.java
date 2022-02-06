package ch10;

public class Excercise1 {

	public static void main(String[] args) {
		// name을 출력하는 코드 작성
		// 답1
		Out out = new Out();
		Out.In in = out.new In();
		System.out.println(in.name);
		
		// 답2
		System.out.println(new Out().new In().name);
	}

}

class Out {
	class In {
		String name = "자바";
	}
}

// 실행결과
// 자바