package day14.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass02 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. ����̹� Ŭ���� ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. �����ͺ��̽� ����
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// 3. ���� ������ ���� Statement ��ü ����
			stmt = conn.createStatement();
			
			// 4. SQL ���� �ۼ� DML
			String sql = "INSERT INTO sales_reps "
					+ "SELECT * FROM sales_reps WHERE 1=2";
			
			// 5. ���� ����
			int result = stmt.executeUpdate(sql);
			System.out.println("result : " + result);
			
			// 6. ������ ����ϱ�
			if (result > 0) {
				System.out.println("������ �߰� ����!");
			} else {
				System.out.println("������ �߰� ����!");
			}
			
//			System.out.println("result : " + result);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
	}

}
