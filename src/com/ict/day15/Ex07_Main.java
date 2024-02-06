package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07_Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

		HashSet<Ex07> set01 = new HashSet<Ex07>();
		Iterator<Ex07> it = set01.iterator();
		while (it.hasNext()) {
			Ex07 ex07 = it.next();
			System.out.println(ex07.getName() + "");
		}

	}
}