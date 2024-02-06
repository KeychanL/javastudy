package com.ict.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex09 {
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
            System.out.print("삭제할 번호를 입력하세요: ");
            int deleteId = Integer.parseInt(scanner.nextLine());

            // PreparedStatement 생성
            String deleteSQL = "DELETE FROM customer WHERE custid = ?";
            pstmt = conn.prepareStatement(deleteSQL);

            // 값을 바인딩
            pstmt.setInt(1, deleteId);

            // 쿼리 실행
            int result = pstmt.executeUpdate();

            // 결과 처리
            if (result > 0) {
                System.out.println("데이터 삭제 성공!");

                // 삭제 후에 SELECT 문 실행
                String selectSql = "SELECT * FROM customer ";
                rs = pstmt.executeQuery(selectSql);

                while (rs.next()) {
                    System.out.print(rs.getString(1) + "\t");
                    System.out.print(rs.getString(2) + "\t");
                    System.out.print(rs.getString(3) + "\t");
                    System.out.print(rs.getString(4) + "\n");
                }
            } else {
                System.out.println("데이터 삭제 실패! 해당 번호가 존재하지 않습니다.");
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

