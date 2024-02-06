package com.ict.day03;

import java.util.Scanner;

public class HW {
public static void main(String[] args) {	
	    
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("아무 말이나 써보세요: ");
	        String word = scanner.next();

	        System.out.println("당신이 쓴거: " + word);

	        scanner.close();
	    }
	
}
//next는 제일 앞 단어만

