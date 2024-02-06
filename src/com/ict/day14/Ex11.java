package com.ict.day14;

import java.util.Scanner;

//throws : 예외전가, 예외양도
//         예외가 발생하면 예외처리를 하지 않고 자신을 호출한 곳으로 예외객체를 전달
//         나중에라도 예외처리를 하는 것이 좋다
public class Ex11 {
	
	
	
	public void setData(String str) {
		//str의 길이가 0보다 크면 (str이 null이 아니면)
		if(str.length()>=1) {
			//첫글자 추출
			String res = str.substring(0,1);
			prnData(res);
		}
		
		
	}
	
	
	
	
	
	private void prnData(String str) {
		int dan = Integer.parseInt(str);
		System.out.println(dan + "단");
		for(int i = 1; i<10; i++){
			System.out.println(dan + " * " + i + "=" + (dan * i));// TODO Auto-generated method stub
		}
		
	}





	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 : ");
	    String msg = scan.next();
	    Ex11 ex11 = new Ex11();
	    ex11.setData(msg);
	}

}
