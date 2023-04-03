package day08.exception;

import day08.mypac.AKWeapon;

public class MainClass02 {
	public static void main(String[] args) {
		AKWeapon ak = null;
		
		int num1 = 10;
		int num2 = 0;
		int result = 0;
	
		try {
			ak.attack();
			result = num1 / num2;
			
		} catch(NullPointerException ne) {
			System.out.println("null ������ �ͼ��� �߻��Ͽ����ϴ�.");
			ne.printStackTrace();
		} catch(ArithmeticException ae) {
			System.out.println("��� ���� 0���� ���� �� �����ϴ�.");
			ae.printStackTrace();
		} catch(Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}
	}
}
