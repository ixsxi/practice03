package com.javaex.practice;

import java.util.Scanner;

public class Ex11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num =sc.nextInt();
		int i;
		int val =0;
		
		for(i=num; i>0; i-=2 ) {
			 val= val+i;
			
		}System.out.println(val);
	}

}
