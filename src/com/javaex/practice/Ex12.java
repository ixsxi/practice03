package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		int i;
		int val = 1;
		
		System.out.println("숫자를 입력하세요");
		
		num = sc.nextInt();
		
		
		
		for(i=num; i>0; i--) {
			val=val*i;
			
		}
		System.out.println(val);
		
		sc.close();
	}

}
