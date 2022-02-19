package ch15;

import java.util.function.Predicate;

public class LambdaEx10 {
	static Student[] list = { 
		new Student("ȫ�浿", 90, 80, "�İ�"), 
		new Student("�̼���", 95, 70, "��� "),
		new Student("������", 100, 60, "�İ�")
	};
	
	public static void main(String[] args) {
		// ���� �İ��� �л��� �������� ���
		double avg = avgEng(t -> t.getMajor().equals("�İ�"));
		System.out.println("�İ��� ��� �������� : "+avg);
		
		// ���� �İ��� �л��� �������� ���
		double avg2 = avgMath(t -> t.getMajor().equals("�İ�"));
		System.out.println("�İ��� ��� �������� : "+avg2);
	}
	
	private static double avgEng(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			// equals ��
			if (predicate.test(student)) {
				count++;
				sum += student.getEnglishScore();
			}
		}
		return (double)sum/count;
	}
	
	private static double avgMath(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			// equals() ��
			if (predicate.test(student)) {
				count++;
				sum += student.getMathScore();
			}
		}
		return (double)sum/count;
	}
}

class Student {
	private String name;
	private int mathScore;
	private int englishScore;
	private String major;
	
	public Student(String name, int mathScore, int englishScore, String major) {
		super();
		this.name = name;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		this.major = major;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}