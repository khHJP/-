package com.sh.api.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalcYourDays {

	/** 
	 * 사용자로부터 생일(년, 월, 일)을 입력받고, 오늘이 태어난지 몇일 되었는지 출력하세요.	 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("생일을 입력하세요> ");
		System.out.print("년 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();
		
		LocalDate now = LocalDate.now();
		LocalDate bDay = LocalDate.of(year, month, day);
		
		long diff = ChronoUnit.DAYS.between(bDay, now);
		System.out.println("당신이 태어난 지 " + diff + "일 되었습니다.");
	}

} 
