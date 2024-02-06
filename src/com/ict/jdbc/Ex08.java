package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "c##ictedu";
            String password = "1111";
            conn = DriverManager.getConnection(url, user, password);

            // 사용자로부터 입력 받기
            System.out.print("번호 입력하세요: ");
            int newid = Integer.parseInt(scanner.nextLine());

            System.out.print("이름 입력하세요: ");
            String newname = scanner.nextLine();

            System.out.print("주소 입력하세요: ");
            String newaddress = scanner.nextLine();

            System.out.print("전화번호 입력하세요: ");
            String newphone = scanner.nextLine();

            // PreparedStatement 생성
            String insertSQL = "INSERT INTO customer (custid, name, address, phone) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertSQL);

            // 값을 바인딩
            pstmt.setInt(1, newid);
            pstmt.setString(2, newname);
            pstmt.setString(3, newaddress);
            pstmt.setString(4, newphone);

            // 쿼리 실행
            int result = pstmt.executeUpdate();

            // 결과 처리
            if (result > 0) {
                System.out.println("데이터 삽입 성공!");

                // INSERT 성공 후에 SELECT 문 실행
                String selectSql = "SELECT * FROM customer ";
                rs = pstmt.executeQuery(selectSql);

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
            // 리소스 정리
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
                scanner.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
