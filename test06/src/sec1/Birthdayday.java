package sec1;

public class Birthdayday {

	public static void main(String[] args) {
		Birthday birth1 = new Birthday();
		birth1.setName("feel-gyu");
		birth1.setDay(14);
		birth1.setMonth(2);
		birth1.setYear(1999);
		birth1.birth();
		birth1.birthAddr();
		
		
		
		Birthday birth2 = new Birthday();
		birth2.setName("feel-gyu");
		birth2.setDay(15);
		birth2.setMonth(3);
		birth2.setYear(1998);
		birth2.birth();
		birth2.birthAddr();

	}

}
