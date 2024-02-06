package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		// customer테이블에 6, 이강인, 대한민국 제주도, 00-1234-9876을 삽입하자
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// ...

		int result = 0;
		try {
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    String url = "jdbc:oracle:thin:@localhost:1521:xe";
		    String user = "c##ictedu";
		    String password = "1111";
		    conn = DriverManager.getConnection(url, user, password);

		    // INSERT 문 실행
		    String insertSql = "INSERT INTO customer VALUES (6, '이강인', '대한민국 제주도', '00-1234-9876')";
		    stmt = conn.createStatement();
		    result = stmt.executeUpdate(insertSql);

		    if (result > 0) {
		        System.out.println("데이터 삽입 성공!");

		        // INSERT 성공 후에 SELECT 문 실행
		        String selectSql = "SELECT * FROM customer WHERE custid = 6";
		        rs = stmt.executeQuery(selectSql);

		        while (rs.next()) {
		            System.out.print(rs.getString(1) + "\t");
		            System.out.print(rs.getString(2) + "\t");
		            System.out.print(rs.getString(3) + "\t");
		            System.out.print(rs.getString(4) + "\n");
		        }
		    } else {
		        System.out.println("데이터 삽입 실패!");
		    }

		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
		    // ...
		}
	}
}
