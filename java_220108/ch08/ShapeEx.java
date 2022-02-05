package ch08;

// �߻�Ŭ������ Ư¡
// 1. �߻�Ŭ������ ��ü�� ������ ����
// 2. �ٸ� Ŭ�������� ����� �޾� ó���ϴ� �뵵
abstract class Shape {			// �߻� Ŭ���� Shape����
	String type;
	Shape() {}
	Shape(String type) {
		this.type = type;
	}
	
	abstract double area();		// �߻� �޼ҵ� area����
	abstract double length();	// �߻� �޼ҵ� length����
}

class Circle extends Shape {
	int ������;
	
	Circle(int ������) {
		super("��");				// super�� Shape�� ����Ŵ
		this.������ = ������;		// this�� Circle�� ����Ŵ 
	}
	
	@Override
	double area() {
		return ������ * ������ * Math.PI; 
	}
	
	@Override
	double length() {
		return ������ * 2 * Math.PI; 
	}
	
	@Override
	public String toString() {		// System.out.print���� ����� �� ���� ����Ǵ� �޼ҵ�
		return "Shape [type=" + type + ", ������=" + ������ + "]";
	}
}

class Rectangle extends Shape {
	int ����, ����;
	
	Rectangle(int ����, int ����) {
		super("�簢��");		// super�� Shape�� ����Ŵ
		this.���� = ����;		// this�� Rectangle�� ����Ŵ 
		this.���� = ����;		// this�� Rectangle�� ����Ŵ
	} 
	
	@Override
	double area() {
		return ���� * ����;
	}
	
	@Override
	double length() {
		return (���� + ����) * 2;
	}
	
	@Override
	public String toString() {		// System.out.print���� ����� �� ���� ����Ǵ� �޼ҵ�
		return "Shape [type=" + type + ", ����=" + ���� + ", ����=" + ���� + "]";
	}
}

public class ShapeEx {
	public static void main(String args[]) {
		//Shape shape1 = new Shape();		// Shape�� �߻�Ŭ�������� ��ü �� �ν��Ͻ�ȭ�� ���� ����
		Shape circle1 = new Circle(10);
		System.out.println(circle1);
		System.out.println("����: " + circle1.area() + ", ����: " + circle1.length());
		
		System.out.println();
		Shape rectangle1 = new Rectangle(5, 5);
		System.out.println(rectangle1);
		System.out.println("����: " + rectangle1.area() + ", ����: " + rectangle1.length());
		
		int[] a = new int[3];
		Circle[] c1 = new Circle[10];
		
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5,5);
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println("����: " + s.area() + ", ����: " + s.length());
		}
	}
}
