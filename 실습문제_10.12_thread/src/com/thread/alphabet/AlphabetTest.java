package com.thread.alphabet;

public class AlphabetTest {

	public static void main(String[] args) {
		Thread upper = new Thread(new UpperAlphabetThread());
		Thread lower = new Thread(new LowerAlphabetThread());
		
		upper.start();
		lower.start();
	}

}
