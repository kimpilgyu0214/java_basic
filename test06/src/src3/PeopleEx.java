package src3;

public class PeopleEx {

	public static void main(String[] args) {
		People p1 = new People();
		p1.selNum = 300;
		p1.name = "Daniel";
		p1.age = 18;
		p1.addr = "용산";
		
		System.out.println(p1.selNum+","+p1.name );
		People p2 = new People();
		p2.selNum = 299;
		p2.name = "Hanni";
		p2.age = 20;
		p2.addr = "용산";
}
	}

