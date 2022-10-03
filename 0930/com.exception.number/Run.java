package com.exception.number;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Run run = new Run();
		run.test1();
	}

	public void test1() {
		// 2개의 정수를 입력받아 checkDouble메소드로 전달 
		// "ㅇㅇㅇ의 배수이다/ 배수가아니다." 
		Scanner sc = new Scanner(System.in);
		NumberProcess num = new NumberProcess();
		
		try {
		System.out.println("1부터 100사이의 정수를 입력하세요.");
		System.out.print("정수 1 : ");
		int a = sc.nextInt();
		System.out.print("정수 2 : ");
		int b = sc.nextInt();
		num.checkDouble(a, b);
		
		if(num.checkDouble(a, b) == true)
		System.out.printf("%d는 %d의 배수이다.", a, b);
		else
		System.out.printf("%d는 %d의 배수가 아니다.", a, b);
		}
		
		catch (NumberRangeException e) {
			System.out.println("1부터 100사이의 값이 아닙니다.");
		}
	}

}
