package sec03;
//구현 클래스
public class Member extends User{
	private String ip;
	private String pw;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Member [ip=" + ip + ", pw=" + pw + "]";
	}
	@Override
	public void connct() {
		System.out.println("회원으로 연결하였습니다.\n ID : "+ip+", pw : **********");
		
	}

}
