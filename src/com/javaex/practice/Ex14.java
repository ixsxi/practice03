package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int num;
		int i;
		int val=0;
		int val2=0;
		
		num =sc.nextInt();
		
		
		for(i=1; i<=num; i++) {
			val=val+i;
			
			System.out.print(i);
			
			if(i!=num) {
				System.out.print("+");
			}else {
				System.out.println("");
			}
		}
		
		System.out.println("합계"+val);
		

			
			sc.close();
	}

}
