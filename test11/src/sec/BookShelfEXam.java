package sec;

public class BookShelfEXam {

	public static void main(String[] args) {
			Queue que = new BookShelf();
			que.enQueue("Off the Record");
			que.enQueue("크리스마스 타일");
			que.enQueue("Hustle");
			
			System.out.println(que.deQueue());
			System.out.println(que.deQueue());
			System.out.println(que.deQueue());

	}

}
