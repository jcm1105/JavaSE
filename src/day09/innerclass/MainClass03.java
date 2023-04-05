package day09.innerclass;

import day09.mypac.Music;

/*
 * [[ 익명클래스 (Anonymous Class) ]]
 * 클래스 선언과 생성을 동시에 하는 이름없는 클래스
 * 일회용 클래스
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		
		Music music = new Music() { // 익명 클래스 -> Music을 상속 받고 있는 이름 없는 클래스
			
			
			@Override
			public void listen() {
				System.out.println("음악을 들어요!");
			}

			@Override
			public void Sing() {
				System.out.println("노래를 불러요!");
				
			}
			
		};music.listen();
		 
		 
		
	}



	}


