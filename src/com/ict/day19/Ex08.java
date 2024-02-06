package com.ict.day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  스트림 : 데이터를 원하는 목적지까지 입출력하는 방법
  종류 : 바이트 스트림, 문자 스트림, 객체 스트림(오브젝트스트림)_
  1. 바이트 스트림 : 모든 처리를 1byte로 처리(기계위주)
             대상 : InputStream(입력), OutputStream(출력)
  2. 문자 스트림 : 모든 처리를 2Byte처리(사람위주)
             대상 : 세계 모든 문자로 구성된 파일을 입출력에 적합
       최상위 클래스 : Reader(입력), Writer(출력)
       
  1-2 결합 스트림 : 바이트 스크림=>문자 스트림
  기계를 통해 입출력된 정보를 사람이 알아볼 수 있도록 입출력한다
  최상위클래스 : InputStreamReader(입력), OutputStreamWriter(출력)
  3. 오브젝트 스트림 : 객체 직렬화 후 객체 단위로 입출력한다 
            대상 : 객체
             최상위 클래스는 오브젝트 인풋 스트림(readObject() : 객체 역 직렬화) 
             오브젝트 아웃풋 스트림(writeObject() : 객체 직렬화) 
 */
public class Ex08 {
	public static void main(String[] args) {
		// 바이트 출력 스트림 : OutputStream 지식 클래스 FileOutStream사용
		// FileOutputStream : 해당 파일에 내용을 1bte쓰기 (출력)
		// 주요 메소드 : write, (int b) : int->숫자(아스키코드0-255) 한 글자
		// 아스키 코드 숫자 소문자 대문자 일바 특수문자
		// write(byte() b) : 배열 b에 존재하는 아스키 코드 출력
		// ** 스트링 클래스getBytes()를 이용하면 byte()로 만들어진다
		// flush () : 출력 버퍼 용량이 다 차지 않아도 바로 출력하게 만드는 메서드
		// close() : 출력 스트림 닫기
		// 파일 만들 위치 저장
		String pathname = "D:\\lkc\\util/test01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
		    fos.write(106);
		    fos.write(97);
		    fos.write(118);
		    fos.write(97);
		    fos.write(13);
		    
		    fos.write('H');
		    fos.write('E');
		    fos.write('L');
		    fos.write('L');
		    fos.write('O');
		    fos.write(13);
		    
		    String msg = "Hi~~~\n안녕\n대한\nBye~~~";
		    byte b[] = msg.getBytes();
		    fos.write(b);
		    
		    fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
