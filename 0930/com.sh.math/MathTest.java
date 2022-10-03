package com.sh.math;


public class MathTest {

	public static void main(String[] args) {
//		1. 3456.5324     => 올림해서 소수점첫째자리까지 표현
		System.out.println((Math.ceil(3456.5324 * 10) / 10));  // 3456.6
		
//		2. 577.26784     => 반올림해서 소수점둘째자리까지 표현
		System.out.println((Math.round(577.26784 * 100)) / 100.0); // 577.27
		
//		3. 552.2987      => 올림해서 소수점셋째자리까지 표현
		System.out.println((Math.ceil(552.2987 * 1000) / 1000)); // 552.299
		
//		4. -845.215      => 내림해서 소수점첫째자리까지 표현   // floor() : 음수 방향으로 가까운 정수 
		System.out.println(Math.floor(-845.215 * 10) / 10); // -845.3

//		5. 324456.24497  => 올림해서 소수점둘째자리까지 표현
		System.out.println((Math.ceil(324456.24497 * 100) / 100)); // 324456.25
	}
	
}
