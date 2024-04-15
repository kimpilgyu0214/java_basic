package src2;

public class Student {
	private String name;
	private int grade;
	private int money;
	
	
	
	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMondey() {
		return money;
	}
	public void setMondey(int mondey) {
		this.money = money;
	}
	
}
