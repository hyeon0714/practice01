package com.javaex.practice;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요.
		(코드를 작성해서 오류가 없도록 변경해 보세요.)

		int x,y
		
		x=10
		y=20      변수지정할때 세미콜론이 없다
		
		sum=x+y    세미콜론 및 sum에 대해 지정된 자료값이 없다
		
		System.out.println("합은'+sum);  문자는 ""으로 감싸야한다
		
		*/
		
		int x,y;
		
		x=10;
		y=20;
		
		int sum=x+y;
		
		System.out.println("합은"+sum);
	}

}
