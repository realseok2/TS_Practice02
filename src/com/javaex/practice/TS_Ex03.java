package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex03 {

	public static void main(String[] args) {

//		Ex03. 다음 코드를 실행 했을 때 결과를 예상한 후 코드를 작성해 확인해 보세요.

		int age;

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이 : ");
		age = sc.nextInt();

		if (age > 20) {
			System.out.println("\"1번그룹\"");
		} else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");

		sc.close();

	}

}
