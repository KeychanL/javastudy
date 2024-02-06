package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// scanner를 이용해서 번호 이름 주소 전화번호를 받아서
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		Scanner scanner = new Scanner(System.in);
		System.out.print("번호 입력하세요: ");
		int newid = scanner.nextInt();
		System.out.print("이름 입력하세요: ");
		String newname = scanner.next();
		System.out.print("주소 입력하세요: ");
		String newaddress = scanner.next();
		System.out.print("전화번호 입력하세요: ");
		int newphone = scanner.nextInt();

		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			// INSERT 문 실행
			String insertSQL = "INSERT INTO customer (custid, name, address, phone) " +
	                   "VALUES (" + newid + ", '" + newname + "', '" + newaddress + "', " + newphone + ")";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(insertSQL);

			if (result > 0) {
				System.out.println("데이터 삽입 성공!");

				// INSERT 성공 후에 SELECT 문 실행
				String selectSql = "SELECT * FROM customer ";
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
