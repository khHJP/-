package com.exception.charcheck;

import java.util.Scanner;

public class Run {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Run run = new Run();
		run.test1();
		
	}
	// 키보드로 문자열 입력
	// countAlpha 메소드로 문자열 전달 -> 실행결과 받아 출력
	// 에러메시지 : "체크할 문자열 안에 공백 포함할 수 없습니다."
	public void test1() {
	
		CharacterProcess cp = new CharacterProcess();
		
		try {
			System.out.print("문자열을 입력하세요: ");
			String str = sc.nextLine(); // next는 개행문자 무시 입력임! 
			
			cp.countAlpha(str); // 예외발생
			System.out.println(cp.countAlpha(str));
			
		} catch (CharCheckException e) {
			System.out.println("체크할 문자열 안에 공백 포함할 수 없습니다.");
		}
	}
	

}
