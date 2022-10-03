package com.sh.api.time; 

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Calendar클래스를 이용해서 D-DAY계산기를 만드세요.
	출력은 다음과 같습니다.

 ->  193일 남았습니다.     (D-DAY 전)
 ->  D-DAY입니다.          (D-DAY)    
 ->  20일 지났습니다.    (D-DAY가 지난 경우)
 *
 */
public class CalcDday {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("D-DAY를 입력하세요 >");
		System.out.print("년 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();
		
		LocalDate now = LocalDate.now();
		LocalDate dDay = LocalDate.of(year, month, day);
		
		long diff = ChronoUnit.DAYS.between(now, dDay);
		
		if(diff > 0) {
			System.out.println(diff + "일 남았습니다.");
		}
		else if (diff < 0) {
			System.out.println(-diff + "일 지났습니다.");
		}
		else {
			System.out.println("D-DAY입니다.");
		}
		
		
	}

}
