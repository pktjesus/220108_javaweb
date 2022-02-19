package ch15;

import java.util.function.Predicate;

public class LambdaEx10 {
	static Student[] list = { 
		new Student("홍길동", 90, 80, "컴공"), 
		new Student("이순신", 95, 70, "통계 "),
		new Student("김유신", 100, 60, "컴공")
	};
	
	public static void main(String[] args) {
		// 과가 컴공인 학생의 영어점수 평균
		double avg = avgEng(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 영어점수 : "+avg);
		
		// 과가 컴공인 학생의 수학점수 평균
		double avg2 = avgMath(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 수학점수 : "+avg2);
	}
	
	private static double avgEng(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			// equals 비교
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
			// equals() 비교
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