package com.ict.day22;

import java.net.ServerSocket;
import java.util.ArrayList;

public class Ex03_Server {
	ArrayList<EX03_ServerClients>list;
	ServerSocket ss;
	public Ex03_Server() {
		list = new ArrayList<Ex03_ServerClients>();
		ss = new ServerSocket(7777);
		System.out.println("서버 시작");
		play();
		
	}catch (Exception e) {
	}
	private void play() {
	
	}
	public static void main(String[] args) {
		new Ex03_Server();
	}

}
