package sec1;

public class Book {
	private String name;
	private boolean spine;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}

	public String print() {
		return "Book [name=" + name + ", spine=" + spine + "]";
	}	
	
	
	
}
