package day11.utill;
/*
 * [[ Stack Class ]]
 * �������� (FILO) : ���� ���� ���� �������� ������.
 * 
 * 
 * 
 * 
 */

import java.util.Stack;

public class MainClass01 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		// ������ ��ü�� �ڷ� �����ϱ�
		stack.push("��ī��");
		stack.push("������");
		stack.push("���̸�");
		stack.push("���α�");
		stack.push("����Ǯ");
		stack.push("�ߵ���");
		
		
		// ���� �����ϰ� �ִ� ������ ����
		System.out.println("������ ���� : " + stack.size());
		
		// �����͸� �ϳ��� ������
		System.out.println("1��: " + stack.pop());
		System.out.println("2��: " + stack.pop());
		System.out.println("3��: " + stack.pop());
		
		System.out.println("�������� �ִ� ������: " + stack.peek());
		
		while(!stack.empty()) {
			String name = stack.pop();
			System.out.println("pop ������ : " + name);
		}
		
		
		
		
	}

}
