package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex13 {

	public static void main(String[] args) {

//		Ex13. 다음과 같이 정의되는 함수의 함수 값을 계산하시오.
//					 x의 3제곱 - 9x +2 , x<=0
//					 7x + 2, x>0

		Scanner sc = new Scanner(System.in);

		double num;

		System.out.println("숫자를입력해 주세요.");
		System.out.print("숫자 : ");
		num = sc.nextDouble();

		if (num > 0) {
			System.out.println("계산 결과는 " + (num * 7 + 2) + "입니다.");
		} else {
			System.out.println("계산 결과는 " + (num * num * num - (9 * num) + 2) + "입니다.");
		}

		sc.close();

	}

}
