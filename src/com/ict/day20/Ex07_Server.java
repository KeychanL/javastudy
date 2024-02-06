package com.ict.day20;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex07_Server {
	ArrayList<ServerClients> list = null;
	ServerSocket ss = null;
	public Ex07_Server() {
		list = new ArrayList<ServerClients>();
		try {
			ss = new ServerSocket(7007);
			System.out.println("서버 시작 !!");
			play();
		} catch (Exception e) {
		}
	}
	public void play() {
		while(true) {
			try {
				// 접속자가 올때까지 기다린다.
				Socket s = ss.accept();
				// 접속자 정보를 가진 소켓이 인자.
				// list를 활용하기 위해서 this를 인자 
				ServerClients clients 
				   = new ServerClients(s, this);
				new Thread(clients).start();
				list.add(clients);
				
			} catch (Exception e) {
			}
		}
	}
	public static void main(String[] args) {
		new Ex07_Server();
	}
}
