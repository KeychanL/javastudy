package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			// 7.sql작성
			//String sql = "select * from book";
			String sql = "select * from book where bookname like '축구%'";
			// 8.sql를 보내기 위해서 구분을 만듬
			stmt = conn.createStatement();
			// 9.보내서 결과 받기
			// 9-1. select 문인 경우
			rs = stmt.executeQuery(sql);
			// 9-2 insert, update, delete 인 경우
			// result = stmt.executeUpdate(sql);
			// rs.getXXX(index => 1부터)
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}

		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}

	}
}
