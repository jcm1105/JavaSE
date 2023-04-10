package day10.lang;
/*
 * [[ ����Ŭ���� (Wrapper Class) ]]
 * �⺻ �ڷ����� ��ü�� ���μ� ����� �� �ֵ��� ���ִ� Ŭ����
 * 	Boolean, Character, Byte, Short, Integer, Long, Float, Double,
 * 
 */

public class MainClass03 {
	public static void main(String[] args) {
		// ���ڿ� "12345"�� ������ ��ȯ�Ͽ� int ������ ����
		String intStr = "12345";
		int iValue = Integer.parseInt(intStr);
		System.out.println("iValue: " + iValue);
		
		// �⺻��ó�� ���� ����
		Integer number1 = 10;
		System.out.println("number1: " + number1);
		
		// ����� �����̸� number1 < number2
		// ����� ����̸� number1 > number2
		// ����� 0�̸� number1 == number2	
		Integer number2 = 10000;
		System.out.println("compreTo: " + number1.compareTo(number2));
		
		// equals ������ Ȯ��
		Integer number3 = 10;  // �Һ�
		Integer number4 = new Integer(10);  // ����
		Integer number5 = Integer.valueOf(10);  // �Һ�
		Integer number6 = Integer.parseInt("10");  // �Һ�
		
		// �Һ� (immutable)
		System.out.println("equals1: " + number1.equals(number3));
		System.out.println("equals2: " + number1.equals(number4));
	    System.out.println("equals3: " + (number1==number3));
		
	    // ���� (mutable)
		System.out.println("equals4: " + (number1==number4));
		
		// ?
		System.out.println("equals5: " + number1.equals(number5));
		System.out.println("equals6: " + (number1==number5));
	
		// �Һ�
		System.out.println("equals7: " + number1.equals(number6));
		System.out.println("equals8: " + (number1==number6));
		
//		number5 = 5;
//		number6 = 5;
	
		
		System.out.println(System.identityHashCode(number1));
		System.out.println(System.identityHashCode(number2));
		System.out.println(System.identityHashCode(number3));
		System.out.println(System.identityHashCode(number4));
		System.out.println(System.identityHashCode(number5));
		System.out.println(System.identityHashCode(number6));
		
		// Integer ��ü�� ���ڿ��� ��ȯ
		System.out.println("toString: " + number1.toString());
		
		
		
	}

}
