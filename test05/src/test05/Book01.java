package test05;

public class Book01 {
		private int bno;
		private String bname;
		private int price;
		private String author;
		private String pub;
		public int getBno() {
			return bno;
		}
		public void setBno(int bno) {
			this.bno = bno;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPub() {
			return pub;
		}
		public void setPub(String pub) {
			this.pub = pub;
		}
		
		public void print(int bno) {
			System.out.println("교재코드 :" +bno);
		}
		@Override
		public String toString() {
			return "Book01 [bno=" + bno + ", bname=" + bname + ", price=" + price + ", author=" + author + ", pub="
					+ pub + "]";
		}
		
}
