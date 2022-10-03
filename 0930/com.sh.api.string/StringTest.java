package com.sh.api.string;

import java.util.Scanner;

public class StringTest {

	/**
	 * - 키보드(Scanner)로 부터 문자열과 문자를 입력받아, 두 개의 메소드 실행 테스트
		- 결과값들 출력 확인
	 * @param args
	 */
	public static void main(String[] args) {
		StringProcess process = new StringProcess();
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요 : ");
		String s = sc.next();
		System.out.print("문자를 입력해주세요 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(process.preChar(s) + "," + process.charSu(s, ch));
		
	}

}
