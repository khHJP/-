package com.sh.api.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 오늘 날짜를 다음 형식으로 출력하세요.

-> 오늘은 2019년 8월 5일 목요일입니다.
 *
 */

public class TodayTest {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		
		char[] dayOfWeek = {'월', '화', '수', '목', '금', '토', '일'};
		char day = dayOfWeek[now.getDayOfWeek().getValue() - 1];
		
		System.out.print(now.format(DateTimeFormatter.ofPattern("오늘은 yyyy년 M월 d일 ")));
		System.out.println(day + "요일입니다.");
	}

}
