package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3,num4,num5 ;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		System.out.print("숫자: ");
		num1 =sc.nextInt();
		
		System.out.print("숫자: ");
		num2 =sc.nextInt();
		
		System.out.print("숫자: ");
		num3 =sc.nextInt();
		
		System.out.print("숫자: ");
		num4 =sc.nextInt();
		
		System.out.print("숫자: ");
		num5 =sc.nextInt();
		
		
		
		while(true) {
			if(num1>num2 && num1>num3 && num1>num4 && num1>num5) {
				System.out.println("최대값은 " +num1+"입니다.");
				break;
			}
			else if(num2>num1 && num2>num3 && num2>num4 && num2>num5) {
				System.out.println("최대값은 " +num2+"입니다.");
				break;
				
			}
			else if(num3>num1 && num3>num2 && num3>num4 && num3>num5) {
				System.out.println("최대값은 " +num3+"입니다.");
				break;
	        }
			else if(num4>num1 && num4>num2 && num4>num3 && num4>num5) {
				System.out.println("최대값은 " +num4+"입니다.");
				break;
			}
			else if(num5>num1 && num5>num2 && num5>num3 && num5>num4) {
				System.out.println("최대값은 " +num5+"입니다.");
				break;
			}
			
			
}
		sc.close();
}
}