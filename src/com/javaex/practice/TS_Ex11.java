package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex11 {

	public static void main(String[] args) {

//		Ex11. 사용자로부터 임의의 알파벳을 입력받아 자음 모음을 구분하여 출력하는 프로그램을 작성하세요.
//					 - switch-case문을 사용합니다.
//					 - 영문 소문자 이외의 입력값은 고려하지 않습니다.

		Scanner sc = new Scanner(System.in);

		char alphabet;

		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳 : ");
		alphabet = sc.next().charAt(0);

		switch (alphabet) {

		case 'a':
			System.out.println("자음입니다.");
			break;

		case 'e':
			System.out.println("자음입니다.");
			break;

		case 'i':
			System.out.println("자음입니다.");
			break;

		case 'o':
			System.out.println("자음입니다.");
			break;

		case 'u':
			System.out.println("자음입니다.");
			break;

		default:
			System.out.println("모음입니다.");
			break;

		}

		sc.close();

	}

}
