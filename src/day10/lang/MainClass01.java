package day10.lang;

import day10.mypac.Sports;

/*
 * [[ java.lang ��Ű�� ]]
 *  �⺻ �������ִ� ��Ű��
 *  import �ʿ���� ��밡��
 *
 * [[ Object Ŭ���� ]]
 *  ��� Ŭ������ �ֻ��� �θ��̴�
 *  �� ��� Ŭ������ Object Ŭ������ ��� �޴´�
 *  extends ���� (�Ƚ�ε�)
 *  
 *  - equals() �޼ҵ� : �� ��ü�� ������ ��ü�� true �������� ������ false ��ȯ
 *  - hashCode() �޼ҵ� : ��ü�� �޸� ������ �̿�, �ؽ��ڵ带 ����� ����
 *  - toString() �޼ҵ� : ��ü�� ���� ������ ����, �� ��ü�� ���ڿ��� ǥ��
 *  - clone() : ���ο� ��ü�� ����(��������)
 *  			Cloneable �������̽� ��ӹ��� ��ü ��밡��
 *   
 *   
 *  immutable �Һ��� ���� -> �޸� ���� ������� ����
 *                        thread safe
 *                        
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		Sports sports1 = new Sports("����", false);
		Sports sports2 = new Sports("����", false);
		
		System.out.println(sports1);
		
		if(sports1.equals(sports2)) {
			System.out.println("sports1 �� sports2�� �����ϴ�");
		} else {
			System.out.println("sports1 �� sports2�� �ٸ��ϴ�");
		}
		
		System.out.println(System.identityHashCode(sports1));
		System.out.println(System.identityHashCode(sports2));
		
		System.out.println(sports1.hashCode());
		System.out.println(sports2.hashCode()); // �ּ� �ٸ�
		
		
		// �⺻�� ���� 
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(System.identityHashCode(num1));
		System.out.println(System.identityHashCode(num2)); // �ּҰ���
		
		num1 = 20;
		System.out.println(System.identityHashCode(num1));
		
		
	}

}
