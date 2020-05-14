package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex08 {

	public static void main(String[] args) {

//		Ex08. 사용자롤부터 정수 3개를 입력 받아 그 중 가장 작은 수를 출력하세요.

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("숫자 3개를 입력해 주세요.");

		System.out.print("숫자1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		num2 = sc.nextInt();
		System.out.print("숫자3 : ");
		num3 = sc.nextInt();

		if (num1 < num2 && num1 < num3) {
			System.out.println("입력받은 숫자 3개 중 가장 작은 숫자는 " + num1 + "입니다.");
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("입력받은 숫자 3개 중 가장 작은 숫자는 " + num2 + "입니다.");
		} else {
			System.out.println("입력받은 숫자 3개 중 가장 작은 숫자는 " + num3 + "입니다.");
		}

		sc.close();

	}

}
