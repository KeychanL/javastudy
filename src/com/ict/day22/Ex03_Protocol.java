package com.ict.day22;

import java.awt.Color;
import java.io.Serializable;

public class Ex03_Protocol implements Serializable{
//cmd : 0 종료(접속해제)
//cmd : 1 채팅
//cmd : 2 
	
	private int cmd;
    
	private int String msg;

private int x, y, wh;
private Color color;
public int getCmd() {
	return cmd;
}
public void setCmd(int cmd) {
	this.cmd = cmd;
}
public int getString() {
	return String;
}
public void setString(int string) {
	String = string;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public int getWh() {
	return wh;
}
public void setWh(int wh) {
	this.wh = wh;
}
public Color getColor() {
	return color;
}
public void setColor(Color color) {
	this.color = color;
}

//get,set



}
