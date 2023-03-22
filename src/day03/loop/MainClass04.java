package day03.loop;
/* 이중 for문
 
 * 
 **
 ***
 ****
 ***** 
 ******
 *******
 
 
 public class MainClass04 {
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
 
 */

public class MainClass04 {
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			
			System.out.println(); //개행용
		}
	}

}
