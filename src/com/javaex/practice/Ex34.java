package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[문제] Ex18 사용자로부터 화씨 온도를 입력받아 섭씨 온도로 변환하는 프로그램을 작성하세요.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("화씨: ");
		
		double f=sc.nextDouble();
		
		System.out.println("화씨 "+f+" 의 섭씨온도는 "+5.0/9.0*(f-32)+"입니다.");
		
		sc.close();
		

	}

}
