package day09.innerclass;
/*
 * [[ ���� Ŭ���� (InnerClass) ]]
 * Ŭ���� ���ο� �ٸ� Ŭ������ �����ϴ� ���� ���Ѵ�
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
			System.out.println("���𰡸� �ؿ�!");
		}
	}
	
}
