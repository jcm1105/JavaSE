package day09.innerclass;

import day09.mypac.Music;

/*
 * [[ �͸�Ŭ���� (Anonymous Class) ]]
 * Ŭ���� ����� ������ ���ÿ� �ϴ� �̸����� Ŭ����
 * ��ȸ�� Ŭ����
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		
		Music music = new Music() { // �͸� Ŭ���� -> Music�� ��� �ް� �ִ� �̸� ���� Ŭ����
			
			
			@Override
			public void listen() {
				System.out.println("������ ����!");
			}

			@Override
			public void Sing() {
				System.out.println("�뷡�� �ҷ���!");
				
			}
			
		};music.listen();
		 
		 
		
	}



	}


