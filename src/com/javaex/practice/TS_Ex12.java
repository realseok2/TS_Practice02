package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex12 {

	public static void main(String[] args) {

//		Ex12. 아래와 같은 계산기 프로그램을 작성하세요
//					 - 기호, 숫자1, 숫자2 순서대로 입력받습니다.
//					 - 기호는 (+, -, *, /) 4가지 입니다.
//					 - 입력된 내용으로 계산하여 결과 값을 출력합니다.
//					 - 나눗셈의 경우 분모가 0이면 "계산 할 수 없습니다."를 출력합니다.

		Scanner sc = new Scanner(System.in);

		int num1, num2;
		char symbol;

		System.out.println("출력하고자 하는 내용들을 입력하세요.");
		System.out.print("기호 : ");
		symbol = sc.next().charAt(0);
		System.out.print("숫자1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		num2 = sc.nextInt();

		if (symbol == '+') {
			System.out.println("결과 값은 " + (num1 + num2) + "입니다.");
		} else if (symbol == '-') {
			System.out.println("결과 값은 " + (num1 - num2) + "입니다.");
		} else if (symbol == '*') {
			System.out.println("결과 값은 " + (num1 * num2) + "입니다.");
		} else {
			if (num2 == 0) {
				System.out.println("계산 할 수 없습니다.");
			}
		}

		sc.close();

	}

}
