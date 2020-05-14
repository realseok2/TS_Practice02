package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex14 {

	public static void main(String[] args) {

//		Ex14. 사용자에게 임의의 수익을 입력 받아 소득세를 계산하는 프로그램을 작성하세요.
//					 - 세금계산법
//					 - 0원 이상 1000만원 이하인 경우 tax : 0.09*수익
//					 - 1000만원 초과 4000만원 이하인 경우 tax : 0.09*1000 + 0.18*(수익-1000)
//					 - 4000만원 초과 8000만원 미만인 경우 tax : 0.09*1000 + 0.18*3000 + 0.27*(수익-4000)
//					 - 8000만원 이상인 경우 tax : 0.09*1000 + 0.18*3000 + 0.27*4000 + 0.36*(수익-8000)
		
		Scanner sc = new Scanner(System.in);
		
		int money;
		
		System.out.println("당신의 수익을 입력해 주세요.");
		System.out.print("수익 : ");
		money = sc.nextInt();
		
		if(0<=money && money<=1000) {
			System.out.println("당신의 소득세는 " + (money*0.09) + "원 입니다.");
		} else if (1000<money && money<=4000) {
			System.out.println("당신의 소득세는 " + ((1000*0.09)+(0.18*(money-1000))) + "원 입니다.");
		} else if (4000<money && money <8000) {
			System.out.println("당신의 소득세는 " + ((1000*0.09)+(3000*0.18)+(0.27*(money-4000))) + "원 입니다.");
		} else if (8000<=money) {
			System.out.println("당신의 소득세는 " + ((1000*0.09)+(3000*0.18)+(4000*0.27)+(0.36*(money-8000))) + "원 입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
	}

}
