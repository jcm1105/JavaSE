package day03.loop;
/*
 * for문
 * 초기식, 조건식, 증감식을 이용하여 반복적으로 코드 블록을 실행하는 제어문
 * 
 * for(초기식; 조건식; 증감식) {
 * 반복 수행할 코드
 * 
 * }
 * 
 * 초기식 -> 조건식 -> 반복 수행 코드
 *  -> 증감식 -> 조건식 -> 반복 수행 코드 ... 조건식 false 일때 까지 반복
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		// for문을 이용하여 0부터 9까지의 숫자를 출력하기
		for(int i=0; i < 10; i++) {
			System.out.println(i); // i 값을 출력하기
		}
		
		// while문 (1)
/*		int count = 0;
		count = 0;
		while(count < 10) {
			System.out.println(count);
			++count; 
	} */
		
		
		// while문
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;  // = ++i;
			
		}

	
	
}}
