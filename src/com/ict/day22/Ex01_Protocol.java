package com.ict.day22;

import java.io.Serializable;

//객체 직렬화
public class Ex01_Protocol implements Serializable{
	//cmd : 0 => 종료(접속해제)
	//cmd : 1 => 대화면 받기(로그인)
	//cmd : 2 => 메세지 전달
	int cmd ;
	String msg ;
	
	public Ex01_Protocol(int cmd, String msg) {
		this.cmd = cmd;
		this.msg = msg;
	}

}
