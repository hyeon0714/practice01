package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성하세요.
		
		Scanner sc=new Scanner(System.in);
		
		double a = 3.14;
		
		System.out.print("반지름: ");
		
		double r=sc.nextDouble();
		
		double v=4.0/3.0*a*r*r*r;
		
		System.out.println("구의 부피는: "+v+"입니다.");
		
		sc.close();
		
		
		
	}

}
