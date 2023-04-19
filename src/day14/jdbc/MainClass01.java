package day14.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * [[ JDBC (Java Database Connectivity) ]]
 * �ڹ� ���ø����̼ǿ��� ������ ���̽��� ����� �� �ִ� API
 * 
 */

public class MainClass01 {
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
			
			// 4. SQL ���� �ۼ�
			String param = "30";
			String sql = "SELECT * "
					+ "FROM employees "
					+ "WHERE department_id=" + param;
			
			// 5. ���� ����
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String employeedId = rs.getString(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				
				System.out.println(employeedId+"/"+firstName+"/"+lastName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)rs.close();
			if(stmt != null)stmt.close();
			if(conn != null)conn.close();
		}
	
	}

}
