package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.URL;
import java.net.URLConnection;

//ㅕURL커넥션클래스 : 원격지 서버 자원의 결과와 원격지 서버의 헤더 정보를 가져올 수 있다.

public class Ex01_Main {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//내 컴퓨터에 저장
		String pathname = "D:\\lkc\\util/webPage02.txt " ;
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL("https://comic.naver.com/index");
			URLConnection conn = url.openConnection();
			
			is=conn.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while(msg=br.readLine())! = null){

	sb.append(msg+"\n");
}
//System.out.println(sb.toString());
		}catch (Exception e) {
			finally {
				try {
					bw.close();
					fw.close();
					br.close();
					isr.close();
					is.close();
				} catch (Exception e2) {
					
				}
			}
		
}
