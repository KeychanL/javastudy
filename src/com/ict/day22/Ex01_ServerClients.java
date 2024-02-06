package com.ict.day22;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Ex01_ServerClients implements Runnable {
	Socket s;
	Ex01_Server server;
	// 직렬화(대상클래스(vo) 인풋 아웃풋
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;

	public Ex01_ServerClients(Socket s, Ex01_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectInputStream(s.getOutputStream());

		} catch (Exception e) {

		}
	}

	@Override
	public void run() {
		esc : while(true){
			try {
				Object obj = in.readObject();
				if(obj !=null) {
					Ex01_protocol p = (Ex01_Protocol) obj;
					switch (p.getCmd()) {
					case 0 : //접속해제(while문)밖에서처리
						//받은 정보는 그대로 보낸다
						out.writeObject(p);
						break esc;
					case 1 : //대화명	받기
						nickName = p.getMsg();
						p.setCmd(2);
						p.setMsg(nickName + "님 입장");
						server.sendMsg(p);
						break;
					case 2 : 
						p.setMsg(nickName + " : " + p.getMsg());
						server.sendMsg(p);
						break;
					}
					
				}
			} catch (Exception e) {
				
			}
		}
		try {
			//cmd가 0이면 접속해제이므로 아래코딩 실행한다
			
		
out.close();
in.close();
s.close();
server.removeClient(this);

Ex01_Protocol p = new Ex01_Protocol(2, nickName + "님 퇴장");
server.sendMsg (p);
		}
		catch(Exception e) {
			
	}

	}
}