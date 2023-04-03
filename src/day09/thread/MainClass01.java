package day09.thread;

import day09.mypac.MyThread;

/*
 * [[ Thread ]]
 * 
 * 	스레드는 프로그램 내에서 실행되는 프로그램 제어 흐름 (실행단위)을 말한다
 * 	하나의 프로세스 내부에서 독립적으로 실행되는 하나의 작업단위
 * 	병령 프로그램
 * 	비동기 프로그램
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");
		MyThread thread1 = new MyThread();
		thread1.start();
		
		System.out.println("메인 스레드가 종료됩니다.");
	}

}
