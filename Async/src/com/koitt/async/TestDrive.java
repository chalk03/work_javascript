package com.koitt.async;

public class TestDrive {

	public static void main(String[] args) {
		// 동기적 실행: 코드를 작성한 순서대로 실행
		System.out.println("1");
		System.out.println("2");
		
		// 비동기적 실행(Async)
		Thread th1 = new Thread(new MyThread());
		Thread th2 = new Thread(new MyThread());
		Thread th3 = new Thread(new MyThread());
		th1.start();
		th2.start();
		th3.start();
	}
}

/*
 * 쓰레드 생성방법
 * 1. Thread 클래스를 상속받아 구현
 * 2. Runnable 인터페이스를 상속받아 구현
 * 
 * 이 중에서 2번째 방법으로 아래와 같이 쓰레드를 구현
 */

class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}