package com.ict.day17;

public class Ex11_Main {
	public static void main(String[] args) {
       Ex11 t =s ->System.out.println(s);
       
       t.showString("Hello lambda");
      //스태틱메소드는 스태틱메소드만 호출할 수 있다
       showMyString(t);
	}
	showMyString(newEx11()){
		
	}
	public static void showMyString(Ex11 k) {
		k.showString("Hello lamda_2");
	}
	
}

