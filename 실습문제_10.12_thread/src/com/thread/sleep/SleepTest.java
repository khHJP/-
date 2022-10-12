package com.thread.sleep;

public class SleepTest {

	public static void main(String[] args) {
		SleepTest test = new SleepTest();
		test.sendAphorism();
	}

	public void sendAphorism() {	
		Thread ap = new Thread(new AphorThread());
		ap.start();		
	}
	
	class AphorThread implements Runnable{
		String[] apArr = {"배워 생각지 않으면 어둡고, 생각하면서 배우지 않으면 위태롭다.", "가는 말이 고와야 오는 말이 곱다.","침묵하라. 아니면 침묵보다 더 가치있는 말을 하라.",
							"성공은 매일 반복한 작은 노력들의 합이다.", "생각하는 대로 살지 않으면 사는 대로 생각하게 된다.", "내가 원하지 않는 바를 남에게 행하지 말라.",
							"무소의 뿔처럼 혼자서 가라.", "계획 없는 목표는 한낱 꿈에 지나지 않는다.", "천리 길도 한 걸음부터.", "마치 수천 년을 살 것처럼 살아가지 말라."};		
		
		@Override
		public void run() {
//			String[] apArr = new String[10];
//			apArr[0] = "배워 생각지 않으면 어둡고, 생각하면서 배우지 않으면 위태롭다."; -> 질문
//          중복 없게 수정? 
						
			int index = 1;
			for(int i = 0; i < apArr.length; i++)				
				try {
					Thread.sleep(3000);
					System.out.println( index + " " + apArr[(int)(Math.random() * 10 + 1)]);
					index++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			
			
			
		}
		
	}
	
	
}
