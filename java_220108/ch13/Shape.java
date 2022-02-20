package ch13;

abstract class Shape {
	// �ʵ�
	int x, y;

	// ������
	Shape() {
		this(0, 0);
	}
	Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	// �߻�޼���
	abstract double area();
	abstract double length();
	
	// �Ϲ� �޼���
	public String getLocation() {
		return "x:" + x + ",y:" + y;
	}
}
