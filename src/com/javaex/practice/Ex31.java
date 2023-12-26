package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("상품가격: ");
		
		int a=sc.nextInt();
		
		System.out.print("받은돈: ");
		
		int b=sc.nextInt();
		
		System.out.println("===============");
		
		System.out.println("받은돈: "+(double)b);
		
		System.out.println("상품가격: "+(double)a);
		
		System.out.println("부가세: "+(double)a/10);
		
		System.out.println("잔액: "+(double)(b-a));
		
		sc.close();

		
	}

}
