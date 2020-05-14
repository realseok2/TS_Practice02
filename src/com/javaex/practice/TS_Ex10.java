package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex10 {

	public static void main(String[] args) {

//		Ex10. 사번(양의 정수)를 입력하면 자신이 속한 팀을 확인 할 수 있는 프로그램을 작성하세요.
//					- 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
//					- 팀을 나누는 방식은 사번을 3으로 나누어 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀으로 구분합니다.
//					- 사번 입력값이 0인 경우는 고려하지 않습니다.

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("당신의 사번(정수)를 입력해 주세요. ");

		System.out.print("사번 : ");
		num = sc.nextInt();

		if (num % 3 == 0) {
			System.out.println("당신은 A팀입니다.");
		} else if (num % 3 == 1) {
			System.out.println("당신은 B팀입니다.");
		} else {
			System.out.println("당신은 C팀입니다.");
		}

		sc.close();

	}

}
