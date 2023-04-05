package day09.innerclass;
/*
 * [[ 내부 클래스 (InnerClass) ]]
 * 클래스 내부에 다른 클래스를 선언하는 것을 말한다
 * 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
	new MainClass01.innerClass().doSomething();
	new innerClass().doSomething();
		
	}

	static class InnerClasss {
		public void doSomething() {
			System.out.println("무언가를 해요!");
		}
	}
	
}
