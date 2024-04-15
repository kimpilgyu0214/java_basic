package sec1;

public class Mama extends Book {
	private int leg;

	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	@Override
	public String print() {
		return "Mama leg=" + leg+"] ";
	}
	
}
