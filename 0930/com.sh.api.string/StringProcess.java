package com.sh.api.string;

public class StringProcess {
	
	/**
	 * 1.문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
  		: +preChar(String s): String

		2.문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성
  		: +charSu(String s, char ch):int
	 * @param args
	 */

	public String preChar(String s) {		
		String front = String.valueOf(s.charAt(0)); // 문자열 첫번째 문자
		String back = s.substring(1, s.length()); // 첫번째를 제외한 문자열
		String capital = front.toUpperCase(); // 첫번째 문자 대문자 변환
		String result = capital + back;
		
		return result;
	}
	
	public int charSu(String s, char ch) {
		char[] arr = s.toCharArray();
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				sum = sum + 1;
			}
		}
		return sum;
	}

}
