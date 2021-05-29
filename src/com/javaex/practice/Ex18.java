package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		
		int num =sc.nextInt();
		
		
		
		for(int i =0; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		
		for(int i =2; i<=num; i++) {
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
