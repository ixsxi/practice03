package com.javaex.practice;

import java.util.Scanner;

public class Ex16_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = sc.nextInt();
		System.out.print("5의 배수의 개수:");
		int val = 0;
		int sibal =num / 5;
		int sum =0;
		
		System.out.println(sibal);
		
		
		
		
		for(int i =0; i<=num; i++) {
			if(i%5 ==0) {
				// 5 , 10 , 15 ,20 
				sum =sum+i;
			}
		}System.out.println(sum);
		
		
	}

}
