package com.ict.day19;

import java.io.File;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		String pathname = "D:\\lkc\\util/exam01.txt";
		File file = new File(pathname);
		try {
			boolean b1 = file.createNewFile();
			if (b1) {
				System.out.println("생성 성공");
			} else {
				System.out.println("생성 실패");
			}
			System.out.println();
			File file3 = new File("D:\\lkc\\util/kkk/yyy");
			boolean b2 = file3.mkdirs();
			if (b2) {
				System.out.println("디렉토리 생성 성공");
			} else {
				// 만들고자 하는 yyy위에 kkk가 존재하지 않아서 실패
				System.out.println("디렉토리 생성 실패");
			}
			// 삭제 대상
			String pathname2 = "D:\\lkc\\util.exam01.txt";
			File file4 = new File(pathname2);
			boolean b4 = file4.delete();
			if (b4) {
				System.out.println("파일 삭제 성공");

			} else {
				System.out.println("파일 삭제 실패");

			}
			// 삭제 대상
			String pathname3 = "D:\\lkc\\util/kkk";
			File file5 = new File(pathname3);
			boolean b5 = file5.delete();
			if (b5) {
				System.out.println("파일 삭제 성공");

			} else {
				System.out.println("파일 삭제 실패");

			}
			System.out.println();
			String pathname4 = "D:\\lkc\\util/kkk/yyy";
			File file6 = new File(pathname3);
			boolean b6 = file6.delete();
			if (b6) {
				System.out.println("파일 삭제 성공");

			} else {
				System.out.println("파일 삭제 실패");

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
