package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		System.out.println("======================");
		System.out.println("[숫자 맞추기 게임 시작");
		System.out.println("======================");
		
		Scanner sc =new Scanner(System.in);
		int ran = (int)(Math.random()*100)+1;
		
		while(true) {
			System.out.print(">>");
			int num =sc.nextInt();
			
			
			if(ran == num) {
				System.out.println("맞았습니다");
				System.out.print("게임을 종료하시겠습니까?(Y/N >>");
				 String anwer=sc.next();
				 
			 if(anwer.equals("Y")) {
				System.out.println("======================");
				System.out.println("[숫자 맞추기 게임 종료");
				System.out.println("======================");
				break;
				
			}else if (anwer.equals("N")) {
				System.out.println("다시시작");
				 ran = (int)(Math.random()*100)+1;
			
			}
				
		}
			if(num>ran) {
				System.out.println("더 낮게");
			}
			else if(num<ran) {
				System.out.println("더 높게");
			}

	}

}
}