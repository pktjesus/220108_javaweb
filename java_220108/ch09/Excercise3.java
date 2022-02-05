package ch09;

interface Player {
	// 추상 메서드
	void play();
}

public class Excercise3 {
	public static void main(String[] args) {
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer();
		
		playGame(p1);
		playGame(p2);
	}
	public static void playGame(Player p) {
		p.play();
	}
}
// BaseBallPlayer 클래스 작성

// FootBallPlayer 클래스 작성

// 출력결과 예시
// -> 야구선수가 야구를 합니다.
// -> 축구선수가 축구를 합니다.