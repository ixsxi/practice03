package com.javaex.practice;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		System.out.println("======================");
		System.out.println("[숫자 맞추기 게임 시작");
		System.out.println("======================");
		
		Scanner sc =new Scanner(System.in);
		int ran = (int)(Math.random()*100)+1;
		String an;
		
		while(true) {
			System.out.print(">>");
			int num =sc.nextInt();
		
			if(ran>num) {
				System.out.println(" 더 높게");
				
				if(ran-num <=5 ) {
					System.out.println(" 근접");
				}
				
			
		}else if(ran<num) {
			System.out.println("더 낮게");
			if(ran-num >=-5 ) {
				System.out.println(" 근접");
			}
		}else {
			System.out.println("맞았습니다.");
			System.out.println("게임을 종료하시겠습니까?(y/n) >>");
			 an = sc.next();
			 
			 if(an.equals("y")) {
				System.out.println("======================");
				System.out.println("[숫자 맞추기 게임 종료");
				System.out.println("======================");
				 break;
			 }
			 else if(an.equals("n")) {              // 다시 while 문 초기로 ㄱㄱ
				 System.out.println("다시시작");
				  ran = (int)(Math.random()*100)+1;
			 }else {
				 System.out.println("Y/N으로만 고르시오");
				 break;
			 }
			 
		
	}
 
			
		
	}
}
}
