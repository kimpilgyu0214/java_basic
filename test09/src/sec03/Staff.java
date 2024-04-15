package sec03;

public class Staff extends User {
	private int level;
	private String part;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	@Override
	public String toString() {
		return "Staff [level=" + level + ", part=" + part + "]";
	}
	@Override
	public void connct() {
		System.out.println(level+"로 올랐습니다.");
		
	}
	
}
