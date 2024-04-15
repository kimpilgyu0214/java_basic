package test12;

public class Student  {
		private int sno;
		String name;
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
			
			
			
			
			String data = "     ivE\'s beauty grOup\nnewJeans is girlGroup Top";
			
			
			
			char ten = data.charAt(9);
			System.out.println("10번째 문자(인덱스가 0인 문자) : " + ten);
			
			String trimData = data.trim();
			System.out.println("앞 뒤의 공백을 제거 : "+trimData.length() + "글자, "+trimData);
			int size = data.trim().length();
			int n = data.indexOf('n');
			
			String up = data.toUpperCase();
			String down = data.toLowerCase();
			String sub1 = data.substring(20,27);
			String sub2 = data.replace("newJeans",  "Kepler");
			byte[] girl = data.getBytes();
			}
		 	
}
