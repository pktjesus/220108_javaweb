package ch08;

// 추상클래스의 특징
// 1. 추상클래스는 객체를 만들지 못함
// 2. 다른 클래스에서 상속을 받아 처리하는 용도
abstract class Shape {			// 추상 클래스 Shape선언
	String type;
	Shape() {}
	Shape(String type) {
		this.type = type;
	}
	
	abstract double area();		// 추상 메소드 area선언
	abstract double length();	// 추상 메소드 length선언
}

class Circle extends Shape {
	int 반지름;
	
	Circle(int 반지름) {
		super("원");				// super는 Shape을 가리킴
		this.반지름 = 반지름;		// this는 Circle을 가리킴 
	}
	
	@Override
	double area() {
		return 반지름 * 반지름 * Math.PI; 
	}
	
	@Override
	double length() {
		return 반지름 * 2 * Math.PI; 
	}
	
	@Override
	public String toString() {		// System.out.print으로 출력을 할 때에 실행되는 메소드
		return "Shape [type=" + type + ", 반지름=" + 반지름 + "]";
	}
}

class Rectangle extends Shape {
	int 가로, 세로;
	
	Rectangle(int 가로, int 세로) {
		super("사각형");		// super는 Shape을 가리킴
		this.가로 = 가로;		// this는 Rectangle을 가리킴 
		this.세로 = 세로;		// this는 Rectangle을 가리킴
	} 
	
	@Override
	double area() {
		return 가로 * 세로;
	}
	
	@Override
	double length() {
		return (가로 + 세로) * 2;
	}
	
	@Override
	public String toString() {		// System.out.print으로 출력을 할 때에 실행되는 메소드
		return "Shape [type=" + type + ", 가로=" + 가로 + ", 세로=" + 세로 + "]";
	}
}

public class ShapeEx {
	public static void main(String args[]) {
		//Shape shape1 = new Shape();		// Shape는 추상클래스여서 객체 및 인스턴스화를 하지 못함
		Shape circle1 = new Circle(10);
		System.out.println(circle1);
		System.out.println("넓이: " + circle1.area() + ", 길이: " + circle1.length());
		
		System.out.println();
		Shape rectangle1 = new Rectangle(5, 5);
		System.out.println(rectangle1);
		System.out.println("넓이: " + rectangle1.area() + ", 길이: " + rectangle1.length());
		
		int[] a = new int[3];
		Circle[] c1 = new Circle[10];
		
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5,5);
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println("넓이: " + s.area() + ", 길이: " + s.length());
		}
	}
}
