package ch12;

public class StringBufferEx4 {

	public static void main(String[] args) {
		// ����
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<100000000; i++) {
			sb.append(i);
		}
		// ��
		long end = System.currentTimeMillis();
		System.out.println("���� �ð� : " + ((end - start)/1000) + "��");
	}
}
