package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		
		for(int i=0; i<num; i++){
		   for(int j=0; j<num-i; j++){
		     System.out.print("*");  //첫번째 --> 5 두번째 -->4
		   }
		   System.out.println(""); // 줄바꿈
		}
	
		
		
		
		
		
		
		
		
		sc.close();
	}

}
