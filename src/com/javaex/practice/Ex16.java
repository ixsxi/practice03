package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		int i;
		int num;
		int val = 0;
		Scanner sc =new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요");
		num=sc.nextInt();
		
		for(i=1; i<=num; i++) {
			
			if(i % 5 == 0) {
				
				val=val+i;
				
				
			}
			
			
			
		}
		System.out.println("5의 배수의 합계: "+ i/5);
		System.out.println("5의 배수의 합 : " + val);

	}

}
