package test05;

public class Board {
	private int bno;
	private String title;
	private String uname;
	private String centent;
	private String resdate;
	private int visited;
	
	
	public Board() {}
	public Board(int bno) {
			this.bno = bno;
	}
	public Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}		

	public Board(int bno, String title, String uname, String centent, String resdate, int visited) {

		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.centent = centent;
		this.resdate = resdate;
		this.visited = visited;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getCentent() {
		return centent;
	}
	public void setCentent(String centent) {
		this.centent = centent;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}

	
}
