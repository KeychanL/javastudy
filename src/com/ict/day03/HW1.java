package com.ict.day03;

import java.util.Scanner;

public class HW1 {
public static void main(String[] args) {	
	    
	Scanner scanner = new Scanner(System.in);

    System.out.print("아무 말이나 써보세요" );
    String sentence = scanner.nextLine();

    System.out.println("당신이 쓴거" + sentence);

    scanner.close();
 }
}
//nextLine은 문장 전체