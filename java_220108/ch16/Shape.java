package ch16;

abstract class Shape implements Comparable<Shape>{
	// �ʵ�
	int x, y;
	
	// ������
	Shape() {
		this(0, 0);
	}
	Shape(int x, int y) {
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
	
	@Override
	public int compareTo(Shape s) {		// ������ �����ϰ� ���ִ� �޼ҵ�
		return (int)(this.area() - s.area()); 
	}
}

