package com.test.spring.di_1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//요구사항] 사용자에게 이름을 입력받아 인사하시오.
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("이름 : ");
//		
//		String name = scan.nextLine();
//		
//		System.out.printf("안녕하세요. %s님\n", name);
		
		
		//Ex01의 의존 객체 -> util
		Util util = new Util();
		
		String name = util.getName();
		
		System.out.printf("안녕하세요. %s님\n", name);
		
	}
	
}


















