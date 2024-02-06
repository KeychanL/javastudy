package com.ict.day11;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        //set 이용해서 멤버필드의 값을 변경했던것을
    	//생성자를 이용해서 변경하자

        Ex06 coffee = new Ex06("커피음료", 1500);
        //coffee.sName("커피음료");
        //coffee.sPrice(1500);

        Ex06 ion = new Ex06("이온음료", 2300);
        //ion.sName("이온음료");
        //ion.sPrice(2300);

        Ex06 cola = new Ex06("탄산음료", 2000);
        //cola.sName("탄산음료");
        //cola.sPrice(2000);

        Ex06 juice = new Ex06("과일음료", 1800);
        //juice.sName("과일음료");
        //juice.sPrice(1800);

        Ex06[] arr1 = { coffee, ion, cola, juice };

        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i].gPrice() > arr1[j].gPrice()) {
                    Ex06 tmp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = tmp;
                }
            }
        }
        Ex06[] arr = { coffee, ion, cola, juice };

        // 낮은금액 정렬

        int minPrice = arr1[0].gPrice();
        Scanner scan = new Scanner(System.in);
        // 살수없는 제품을 선택하면 계산이 되는 현상 ( 살수 없다고 표시하고 다시 메뉴가 나와야 한다.)

        System.out.println("금액을 투입하세요");
        int input = scan.nextInt();
        int output = input;

        esc: while (true) {
            System.out.println("남은 돈 : " + input);
            if (output < minPrice) {
                System.out.println("금액이 부족합니다.");
                System.out.println("금액은 자동으로 반환됩니다.");
                System.out.println("잔돈 : " + output);
                break;
            } else {
                System.out.println("커피\t이온\t탄산\t과일\t반환");
                // 각 음료수의 가격을 가져와서 비교하자
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].gPrice() <= output) {
                        System.out.print("O\t");
                    } else {
                        System.out.print("X\t");
                    }
                }
                System.out.println();
                System.out.println("선택하세요 >> ");
                String drink = scan.next();

                switch (drink) {
                case "커피":
                    output = output - (arr[0].gPrice());
                    break;
                case "이온":
                    output = output - (arr[1].gPrice());
                    break;
                case "탄산":
                    output = output - (arr[2].gPrice());
                    break;
                case "과일":
                    output = output - (arr[3].gPrice());
                    break;
                case "반환":
                    output = input;
                    break esc;

                }
            }
            input = output;
        }
        System.out.println("잔돈 : " + output);

    }
}