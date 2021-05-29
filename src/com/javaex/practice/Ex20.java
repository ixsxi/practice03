package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ran = (int)(Math.random()*100)+1;
		String end;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("[숫자 맞추기 게임 시작]");
		System.out.println("=========================");
		System.out.print(">>");
		
		
		int num =sc.nextInt();
		 end =sc.nextLine();
		
		
		while (true) {
			
			
			if(ran>num) {
			
				System.out.println("더 높게");
				System.out.print(">>");
				num =sc.nextInt();
				
				
			}if(ran<num) {
				
				System.out.println("더 낮게");
				System.out.print(">>");
				num =sc.nextInt();
				
			}else if(ran == num) {
				System.out.println("맞았습니다");
				System.out.println("게임을 종료하시겠습니까?(y/n) >>");
				sc.next().equals("y");
				break;
			}
			
			
		}
		System.out.println("=========================");
		System.out.println("숫자맞추기 게임 종료");
		System.out.println("=========================");

		
		/*
		 end =sc.nextLine();
		 
		 if(sc.next().equals("y")) {
			 
			System.out.println("=========================");
			System.out.println("숫자맞추기 게임 종료");
			System.out.println("=========================");
			
		 }*/
		
	}

}
