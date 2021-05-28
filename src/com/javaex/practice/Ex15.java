package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int num;
		int i ;
		 num =sc.nextInt();
		 
		 /* for문에서 초기값은 단독으로 사용못함 , 왜 for문에 if 문을 넣어야하는가 ... ? */
		 for( i=1; i<=num; i++) {
			 if(num  % i == 0) {
				 System.out.println(i);
			 }
			 
			sc.close();
			 
		 }
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		

	}

}
