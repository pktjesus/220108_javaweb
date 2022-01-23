package ch07;

public class CarMain3 {

	public static void main(String[] args) {
		// Car 타입의 배열객체 생성
		Car[] cars = new Car[3];

		// Car 객체 생성
		Car tico = new Car();
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
		
		// 모든 인덱스에 tico객체 저장
		for (int i =0; i < cars.length; i++) {
			cars[i] = tico;		// shallow copy 대입
		}
		System.out.println("2번 인덱스 color : " + cars[2].color);	//화이트
		
		cars[0].color = "블랙";// 0번 인덱스 객체의 color 필드에 "블랙" 대입
		
		System.out.println("0번 인덱스 color : " + cars[0].color);	//블랙
		System.out.println("1번 인덱스 color : " + cars[1].color);	//블랙
		System.out.println("2번 인덱스 color : " + cars[2].color);	//블랙
	}

}
