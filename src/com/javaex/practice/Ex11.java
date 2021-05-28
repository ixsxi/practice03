package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int val = 0;
		int i; 
		
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		num = sc.nextInt();
		
		for(i=num; i>0; i-=2) {   // i> 0은 true로 반복할것을 찾기위함 .. ?
			   val=val+i;       
			
		}
		System.out.println("결과값"+ val);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
