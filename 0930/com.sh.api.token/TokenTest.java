package com.sh.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
		public static void main(String[] args) {
		
			String str = "J a v a P r o g r a m ";
			// 토큰처리전 글자 출력
			System.out.println(str);
			// 토큰처리전 글자 개수 출력
			System.out.println(str.length());  // 22
			
			// 토큰 처리 후 글자개수 출력
			StringTokenizer tokenizer = new StringTokenizer(str," ");
			int num = tokenizer.countTokens();
			System.out.println(num); // 11
			
			// char배열 선언
			char[] arr = new char[num];
			
			// char배열에 token값 대입
			for(int i = 0; i < arr.length; i++) {
					String printToken = tokenizer.nextToken();	
					arr[i] = printToken.charAt(0);
			}
			// char배열 출력
			System.out.println(Arrays.toString(arr));
			
			// char배열 -> String변환
			String result = String.valueOf(arr);
			// 대문자변환
			System.out.println(result.toUpperCase());
			
		}
 
	}



