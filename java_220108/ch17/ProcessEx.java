package ch17;

public class ProcessEx {

	public static void main(String[] args) {
		try {
			// �޸��� ����
			Process p1 = Runtime.getRuntime().exec("calc.exe");
			// �׸��� ����
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			
			p1.waitFor(); // p1 ���μ����� ����ɶ����� ���
			p2.destroy(); // p1 ���μ����� ����Ǹ� ����
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
