package day10.lang;

import day10.mypac.Sports;

/*
 * [[ java.lang 패키지 ]]
 *  기본 제공해주는 패키지
 *  import 필요없이 사용가능
 *
 * [[ Object 클래스 ]]
 *  모든 클래스의 최상위 부모이다
 *  즉 모든 클래스는 Object 클래스를 상속 받는다
 *  extends 생략 (안써두됨)
 *  
 *  - equals() 메소드 : 두 객체가 동일한 객체면 true 동일하지 않으면 false 반환
 *  - hashCode() 메소드 : 객체의 메모리 번지를 이용, 해시코드를 만들어 리턴
 *  - toString() 메소드 : 객체의 문자 정보를 리턴, 즉 객체를 문자열로 표현
 *  - clone() : 새로운 객체로 복사(깊은복사)
 *  			Cloneable 인터페이스 상속받은 객체 사용가능
 *   
 *   
 *  immutable 불변의 변수 -> 메모리 값이 변경되지 않음
 *                        thread safe
 *                        
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		Sports sports1 = new Sports("수영", false);
		Sports sports2 = new Sports("수영", false);
		
		System.out.println(sports1);
		
		if(sports1.equals(sports2)) {
			System.out.println("sports1 과 sports2는 같습니다");
		} else {
			System.out.println("sports1 과 sports2는 다릅니다");
		}
		
		System.out.println(System.identityHashCode(sports1));
		System.out.println(System.identityHashCode(sports2));
		
		System.out.println(sports1.hashCode());
		System.out.println(sports2.hashCode()); // 주소 다름
		
		
		// 기본형 변수 
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(System.identityHashCode(num1));
		System.out.println(System.identityHashCode(num2)); // 주소같음
		
		num1 = 20;
		System.out.println(System.identityHashCode(num1));
		
		
	}

}
