package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정)
		
		Scanner sc=new Scanner(System.in);
		final double mile=1.609;
		
		System.out.print("마일을 입력하세요:");
		
		double m=sc.nextDouble();
		
		System.out.println(m+"마일은 "+mile*m+"킬로미터입니다");
		
		sc.close();
		
		
		

	}

}
