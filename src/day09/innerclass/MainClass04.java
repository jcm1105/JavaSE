package day09.innerclass;

import day09.mypac.Music;
import day09.mypac.Singer;

public class MainClass04 {
	public static void main(String[] args) {
		Singer s = new Singer(new Music() {

			@Override
			public void listen() {
				System.out.println("������ ����");
				
			}

			@Override
			public void Sing() {
				System.out.println("�뷡�� �ҷ���");
				
			}
			
		});
	}

}
