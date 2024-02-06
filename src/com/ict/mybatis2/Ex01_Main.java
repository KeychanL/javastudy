package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;

public class Ex01_Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 전체 테이블 보기
        List<Ex01_VO> list = Ex01_DAO.getList();
        prn(list);

        // 메뉴 출력 및 선택
        System.out.println("선택하세요");
        System.out.println("1. numbers 테이블 특정 데이터 보기");
        System.out.println("2. numbers 테이블 데이터 삽입");
        System.out.println("3. numbers 테이블 특정 데이터 삭제");
        System.out.println("4. numbers 테이블 특정 데이터 수정");
        System.out.print(">>>>>>>>>>>>>>>>   ");
        int menu = scan.nextInt();

        switch (menu) {
     // Ex01_Main 클래스의 getOne 호출 부분 수정
     // Ex01_Main 클래스의 getOne 호출 부분 수정
        case 1:
            // 특정 데이터 보기
            System.out.print("검색할 idx : ");
            int idx = scan.nextInt();  // int로 변경
            Ex01_VO vo = Ex01_DAO.getOne(String.valueOf(idx));
            prn(vo);
            break;



            // ... (이하 동일)
        
    

    // ... (이하 동일)



            case 2:
                // 데이터 삽입
                System.out.println("삽입할 정보를 입력하세요");
                Ex01_VO insertVO = getInputFromUser(scan);
                int insertResult = Ex01_DAO.getIns(insertVO);
                printResultAndList(insertResult);
                break;

            case 3:
                // 데이터 삭제
                System.out.print("삭제할 idx : ");
                int idxToDelete = scan.nextInt();
                int deleteResult = Ex01_DAO.getDel(idxToDelete); // 수정
                printResultAndList(deleteResult);
                break;

            case 4:
                // 데이터 수정
                System.out.println("수정할 정보를 입력하세요");
                Ex01_VO updateVO = getInputFromUser(scan);
                int updateResult = Ex01_DAO.getUp(updateVO);
                printResultAndList(updateResult);
                break;
        }
    }

    // 사용자로부터 데이터 입력 받기
    private static Ex01_VO getInputFromUser(Scanner scanner) {
        System.out.print("idx : ");
        int idx = scanner.nextInt();

        System.out.print("id : ");
        String id = scanner.next();

        System.out.print("pw : ");
        String pw = scanner.next();

        System.out.print("username : ");
        String username = scanner.next();

        System.out.print("age : ");
        int age = scanner.nextInt();

        System.out.print("regdate : ");
        String regdate = scanner.next();

        return new Ex01_VO(idx, id, pw, username, age, regdate);
    }

    // 결과 출력 및 리스트 갱신
    private static void printResultAndList(int result) {
        if (result > 0) {
            List<Ex01_VO> updatedList = Ex01_DAO.getList();
            prn(updatedList);
        } else {
            System.out.println("작업 실패");
        }
    }

    // numbers 테이블 전체 보기
    public static void prn(List<Ex01_VO> list) {
        System.out.println("idx\tid\tpw\t\tusername\tage\tregdate");
        for (Ex01_VO k : list) {
            System.out.print(k.getIdx() + "\t");
            System.out.print(k.getId() + "\t");
            System.out.print(k.getPw() + "\t");
            System.out.print(k.getUsername() + "\t");
            System.out.print(k.getAge() + "\t");
            System.out.print(k.getRegdate() + "\n");
        }
    }

    // numbers 테이블 특정 데이터 보기
    public static void prn(Ex01_VO vo) {
        System.out.println("idx\tid\tpw\t\tusername\tage\tregdate");
        System.out.print(vo.getIdx() + "\t");
        System.out.print(vo.getId() + "\t");
        System.out.print(vo.getPw() + "\t");
        System.out.print(vo.getUsername() + "\t");
        System.out.print(vo.getAge() + "\t");
        System.out.print(vo.getRegdate() + "\n");
    }
}
