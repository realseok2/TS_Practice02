package com.javaex.practice;

public class TS_Ex01 {

	public static void main(String[] args) {

//		Ex01. 다음의 코드는 오류가 있습니다. 오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요.
//		
//		int age = 15;
//		
////		age가 0살 초과이고 18살 미만이면 
//		if (0 < age <18) {
//			System.out.println("청소년입니다.");
//		}
		
		int age = 15;
		
		if (0 < age && age <18) {																				//		두가지의 부등호를 동시에 사용 할 수 없기 때문에 &&로 나누어 두번에 걸쳐 작성해야 한다.
			System.out.println("청소년입니다.");
		}
	}
}
