package com.thread.alphabet;

public class LowerAlphabetThread implements Runnable{

	@Override
	public void run() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
		
	}

}
