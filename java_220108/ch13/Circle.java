package ch13;

public class Circle extends Shape {
	// �ʵ�
	double r;
	
	// ������
	Circle() {
		this(1);
	}
	Circle(double r) {
		this.r = r;
	}
	
	// �޼��� ������(�������̵�)
	@Override
	double area() {
		return (r * r) * Math.PI;
	}
	
	@Override
	double length() {
		return (r * 2) * Math.PI;
	}
}
