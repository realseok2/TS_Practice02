package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex07 {

	public static void main(String[] args) {

//		Ex07. 사용자로부터 두 개의 정수를 입력 받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.print("첫번째 숫자를 입력해 주세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력해 주세요 : ");
		num2 = sc.nextInt();

		System.out.println("첫번째 숫자를 두번째 숫자로 나눈 값의 몫은" + num1 / num2 + "이고 나머지는" + num1 % num2 + "입니다.");

		sc.close();

	}

}
