package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
	public static void main(String[] args) {
		
		// 장미란 둘리로 주소는 서울 방학동
		//오라클에 접속을 위한 초기값들
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
		    String updateSql = "UPDATE customer SET address = '서울시방학동', name='둘리' WHERE address = '서울시방학동'";
		    stmt = conn.createStatement();
		    result = stmt.executeUpdate(updateSql);

		    if (result > 0) {
		        System.out.println("데이터 삽입 성공!");
                 psmt=conn.prepareStatement(updateSql);
		        // INSERT 성공 후에 SELECT 문 실행
		        String selectSql = "SELECT * FROM customer ";
		        rs = pstm.executeQuery(selectSql);

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
