package sec2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Oracle01 {
	public static void main(String[] args) {
			Connection con = null;
			PreparedStatement  pstmt = null;
			ResultSet rs = null;
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String uerid = "system";
			String userpw = "1234";
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
	}

}
