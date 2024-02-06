package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Ex06_Client implements Runnable {
public static void main(String[] args) {
	Socket socket;
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	BufferedReader keyboard = null;
	
	InputStreamReader isr =null;
	BufferedReader br = null;
	
	public Ex06_Client() {
		try {
		System.out.print("데이터 입력 : ");
		keyboard = new BufferedReader(new InputStreamReader(System.in));
		String msg = keyboard.readLine();
		
		//서버에 접속
		socket = new Socket("192.168.0.20", 7001);
		osw = new OutputStreamWriter(socket.getOutputStream());
		bw = new BufferedWriter(osw);
		bw.flush();
		}
	}	
		
	catch(Exception e) {
	}
}

	@Override
	public void run() {
while (true)
		new Ex06_Client();
	}
}
