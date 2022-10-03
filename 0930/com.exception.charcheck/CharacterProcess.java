package com.exception.charcheck;

public class CharacterProcess {

	public CharacterProcess() {
		super();
	}

	// 전달된 문자열값에서 영문자가 몇개인지 카운트 - 리턴 
	// 공백문자가 있으면 CharCheckException
	public int countAlpha(String s) {
		
		int cnt = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				throw new CharCheckException();
			}
			else if ((65 < s.charAt(i) && s.charAt(i) < 90) || (97 < s.charAt(i) && s.charAt(i) < 122)) {
				cnt++;								
			}
		} // for문 끝
		
		return cnt;
	}
}
