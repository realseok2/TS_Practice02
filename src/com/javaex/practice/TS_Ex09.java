package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex09 {

	public static void main(String[] args) {

//		Ex09. 사용자로부터 두 개의 정수를 입력 받은 후 그 중 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
//					 (0은 입력하지 않습니다.)

		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.print("첫번째 숫자를 입력해 주세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력해 주세요 : ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			if (num1 % num2 == 0) {
				System.out.println(num2 + "은(는) " + num1 + "의 약수가 맞습니다.");
			} else {
				System.out.println(num2 + "은(는) " + num1 + "의 약수가 아닙니다.");
			}
		} else if (num1 < num2) {
			if (num2 % num1 == 0) {
				System.out.println(num1 + "은(는) " + num2 + "의 약수가 맞습니다.");
			} else {
				System.out.println(num1 + "은(는) " + num2 + "의 약수가 아닙니다.");
			}
		} else {
			System.out.println("입력하신 두 숫자는 같은 숫자입니다.");
		}

		sc.close();

	}

}
