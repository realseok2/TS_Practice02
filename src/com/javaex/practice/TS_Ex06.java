package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Ex06. 사용자로부터 두개의 숫자를 입력받아 두 수 중 큰 수와 작은 수를 분류하여 출력하세요.

		int num1, num2;

		System.out.println("숫자 두개를 입력해 주세요.");

		System.out.print("숫자1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("두 수 중 더 큰 수는 " + num1 + "입니다.");
		} else if (num1 < num2) {
			System.out.println("두 수 중 더 큰 수는 " + num2 + "입니다.");
		} else {
			System.out.println("입력받은 두 수는 같은 숫자입니다.");
		}

		sc.close();
	}

}
