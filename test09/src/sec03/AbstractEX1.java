package sec03;

public class AbstractEX1 {

	public static void main(String[] args) {
		User u1 = new Member();
		//User u1 = new User(); // User 클래스는 추상 클래스이므로 추상 메소드의 구현 내용이 기술되어 있다
		User s1;
		s1 = new Member();
		s1.setIp("1962.2422");
		s1.setPort(90);
		s1.connct();
		
		
		Member s2;
		s2 = new Member();
		s2.setIp("5137.1457");
		s2.setPort(91);
		s2.connct();

	}

}
