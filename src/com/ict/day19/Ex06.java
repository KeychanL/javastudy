package com.ict.day19;

import java.io.File;

/*파일 클래스 : 특정위치에 존재하는 파일이나 디렉토리를 처리하는 클래스
 * - 주요 생성자 : File (String 경로), File(String 상위경로, String 하위경로)
 *                                 File(String 상위경로, String 하위경로)
 * -주요 메서드  : createNewFile() : 파일 생성
 *              mkdir() : 만들때 상위 디렉토리 없으면 생성불가
 *              mkdirs() : 만들때 상위 디렉토리 없으면 상위디렉토리까지만들어줌
 * -            delete() : 삭제
 *              isFile() : 파일이면 true
 *              isDirectory() : 디렉토리면 true
 *              exists() : 파일이 잇으면 true// contain과 비슷한 
 *              getName() : 이름반환
 *              length() : 파일의 크기를 바이트로 변환
 *              list() : 특정위치의 내용을 string으로 저장
 *              getAbsolutePath() : 절대주소
 *              getPath() : 상대주소      
 */
public class Ex06 {
	public static void main(String[] args) {
		// 본인 환경에 맞게
		// String pathname = "F:\\nohssam\\javastudy";
		String pathname = "D:\\lkc\\javastudy";
		File file = new File(pathname);
		String[] arr = file.list();
		for (String k : arr) {
			System.out.println(k);
			File file2 = new File(pathname, k);
			// System.out.println(file2);
			if (file2.isDirectory()) {
				System.out.println("디렉토리: " + k);
			} else {
				//Byte
				System.out.println("파일 : " + k + "," + k.length() + "Byte");
				System.out.println("파일 : " + k + "," + (int)(Math.ceil(k.length()*1.0/1024)) + "KB");

			}
		}

	}
}
