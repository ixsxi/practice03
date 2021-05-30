package com.javaex.practice;

import java.util.Scanner;

public class Ex10_1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자:");
		int num = sc.nextInt();
		
		System.out.print("숫자:");
		int num1 = sc.nextInt();
		
		System.out.print("숫자:");
		int num2 = sc.nextInt();
		
		System.out.print("숫자:");
		int num3 = sc.nextInt();
		
		System.out.print("숫자:");
		int num4 = sc.nextInt();
		
		
		if(num>num2 && num>num3 && num>num4 && num>num1) {
			System.out.println("최대값은"+num+"입니다");
		}else if(num1>num2 && num1>num3 && num1>num4 && num1>num) {
			System.out.println("최대값은"+num1+"입니다");
		}else if(num2>num1 && num2>num3 && num2>num4 && num2>num) {
			System.out.println("최대값은"+num2+"입니다");
		}else if(num3>num1 && num3>num2 && num3>num4 && num3>num) {
			System.out.println("최대값은"+num3+"입니다");
		}else if(num4>num1 && num4>num2 && num4>num3 && num4>num) {
			System.out.println("최대값은"+num4+"입니다");
		}
		
		

	}

}
