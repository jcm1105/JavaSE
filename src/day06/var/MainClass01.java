package day06.var;
/*
 * [[ ���� (variable) ]]
 * �޸� ������ �ٿ��� �̸�
 * 
 * ���� ���� �� �ʱ�ȭ
 * �ڷ��� (type) ������ = ��
 * 
 * 1. Ÿ�Կ� ���� ����
 * 	    �⺻�� - �����, �ҹ��ڷ� ����, ���� ���� ������ �ִ�
 *    8���� - boolean, byte, short, char
 *           int, long, double, float,
 * 	    ������ - �⺻�� �� ������ ����, �ּ� ���� ������ �ִ�, �빮�ڷ� ����
 *     ex) String
 * 
 * 2. ���� ��ġ�� ���� ����
 * 	  �������� - Ŭ���� �ȿ� ����� ���� (�������)
 * 			   �ʱ�ȭ ���� ������ default ���� ����
 * 				boolean - false
 * 				������ - 0
 * 				�Ǽ��� - 0.0
 * 				������ - null	
 * 
 *   �������� - �޼ҵ� �Ǵ� ������ �ȿ� ���� �߰��� �Ű�����
 *            �ݵ�� �ʱ�ȭ ����� �Ѵ�! (������ ����)
 *   		   
 *   3. ����(static) / ���� ����
 *   	���� - static�� ���� ��� ����
 *   			��� ��ü�� �����Ѵ�.
 *   			Ŭ���������� ���� ����!
 *   			�������� �ʰ� �ҷ��� �� �ִ�.
 *   
 *   	���� - static�� �ƴ� �Ϲ� �������
 * 
 * 
 * 
 */

import day06.mypac.Card;

public class MainClass01 {
	// ���� ����
	/*static*/ int gNum1 = 20;
	int gNum2;
	
	String gStr = "MainClass01";
	String gStr2;
	
	
	public static void main(String[] args) {
		int num1 = 10;  // ������ ���� 10���� �ʱ�ȭ
		int num2;       // ������ ���� �ʱ�ȭ X
		
		System.out.println(num1);
//		System.out.println(num2);  // �ʱ�ȭ X ������ ���� �߻�!
	
		MainClass01 m1 = new MainClass01();
		System.out.println(m1.gNum1);
		System.out.println(m1.gNum2);
		
		System.out.println(m1.gStr);
		System.out.println(m1.gStr2);
		
	    System.out.println("------------");
	    
	    
	    System.out.println(Card.width);
		System.out.println(Card.height);
	    
		Card card = new Card();
		
		
		System.out.println(card.type);
		System.out.println(card.number);
		
		
		
		
		
	}

}