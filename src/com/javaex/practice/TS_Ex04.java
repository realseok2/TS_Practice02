package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex04 {

	public static void main(String[] args) {

//		Ex04. 나이를 입력 받아 19세 이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);

		int age;
		System.out.println("당신의 나이를 입력해 주세요.");
		System.out.print("나이 : ");
		age = sc.nextInt();

		if (19 <= age && age <= 65) {
			System.out.println("당신은 1번그룹 입니다.");
		} else {
			System.out.println("당신은 2번그룹 입니다.");
		}

		sc.close();

	}

}
