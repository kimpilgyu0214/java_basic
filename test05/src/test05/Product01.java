package test05;

public class Product01 {
	private String pname;
	private int pcode;
	private int price;
	private int size;
	private int amount;
	private String remark;
	
	
	public void print(int price) {
		System.out.println("제품정보");
	}		
	public void print(String pname) {
		System.out.println("제품이름 : "+pname);
	}
	
	public void print1(int pcode) {
		System.out.println("제품가격 : "+pcode);
	}
	public void print(int size)	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	@Override
	public String toString() {
		return "Product01 [pname=" + pname + ", pcode=" + pcode + ", price=" + price + ", size=" + size + ", amount="
				+ amount + ", remark=" + remark + "]";
	}
	
	
}


