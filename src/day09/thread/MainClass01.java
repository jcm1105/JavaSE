package day09.thread;

import day09.mypac.MyThread;

/*
 * [[ Thread ]]
 * 
 * 	������� ���α׷� ������ ����Ǵ� ���α׷� ���� �帧 (�������)�� ���Ѵ�
 * 	�ϳ��� ���μ��� ���ο��� ���������� ����Ǵ� �ϳ��� �۾�����
 * 	���� ���α׷�
 * 	�񵿱� ���α׷�
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("���� ������ ����!");
		MyThread thread1 = new MyThread();
		thread1.start();
		
		System.out.println("���� �����尡 ����˴ϴ�.");
	}

}
