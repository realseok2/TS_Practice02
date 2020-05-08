package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex05 {

	public static void main(String[] args) {

//		Ex05. 사용자로 하여금 키와 몸무게를 입력받아 해당 지표의 표준체중과 비교하여 저체중, 표준, 과체중으로 구분하여 출력하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int height = 0, weight;
		
		double avg = (height-100)*0.9;
		
		System.out.println("당신의 키와 몸무게를 입력해 주세요.");
		System.out.print("키 : ");
		height = sc.nextInt();
		System.out.print("몸무게 : ");
		weight = sc.nextInt();
		
		if (avg==weight ) {
			System.out.println("당신은 정상체중 입니다. 현재 체형을 유지하세요.");
		} else if (avg >weight) {
			System.out.println("당신은 저체중입니다. 체중을 증량하세요.");
		} else {
			System.out.println("당신은 과체중입니다. 체중을 감량하세요.");
		}
		
		
		
		
		
		sc.close();
		
		
		
	}

}
