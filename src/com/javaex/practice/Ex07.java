package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num =sc.nextInt();
		
		
		for(int num2 = 1; num2<=num; num2++) {
			for(int num3=0; num3<num2; num3++) {
				System.out.print(num2);
			}
			
			System.out.println("");
			
		}
			

	}

}


///////////못함/////////