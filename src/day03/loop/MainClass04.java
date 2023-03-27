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
		
	//1
		for (int i = 1; i < 5; i++) {
			for(int j = 1; j < 5-i; ++j) { 
		System.out.print(" ");}
			
			for (int k = 1; k < i+1; k++) {
				System.out.print("*");
		}System.out.println();}	// 개행
		
		
		
		//2
		System.out.println();
		for (int i = 1; i < 5; i++) {
			for(int j = 1; j <= 4-i; ++j) { 
		System.out.print(" ");
				
			}for (int k = 0; k < (2*i)-1; k++) {
				System.out.print("*");
				} System.out.println();} //개행
	
		
	//3-1
	System.out.println();
	for (int i = 1; i < 5; i++) {
		for(int j = 1; j <= 4-i; ++j) { 
	System.out.print(" ");}
		
		for (int k = 0; k < (2*i)-1; k++) {
			System.out.print("*");
			} System.out.println();} //개행
	
	//3-2
	for (int i = 1; i < 5; i++) {
		for(int j = 1; j <=i; ++j) { 
			System.out.print(" ");}
		
		for (int k = 7; k >= (2*i)+1; k--) {
			System.out.print("*");}
		System.out.println();} //개행
		}	
}

		