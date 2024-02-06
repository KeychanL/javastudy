package com.ict.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerClients implements Runnable {
	Socket s;
	Ex07_Server server;
	
	BufferedReader in;
	PrintWriter out;
	String ip;
	
	
	public ServerClients(Socket s, Ex07_Server server) {
		this.s=s;
		this.server=server;
		try {
		  in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		  out = new PrintWriter(s.getOutputStream(), true);
		}catch (Exception e) {
			
		}
	}
	@Override
	public void run() {
		
	}

}
