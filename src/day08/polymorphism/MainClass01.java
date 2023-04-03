package day08.polymorphism;
/*
 * [[ 다형성 (polymorphism)
 * 하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미
 * 
 * instanceof 연산자
 * 	객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부를 확인하는데 사용!
 * 
 * 
 */

import day08.mypac.AKWeapon;
import day08.mypac.M4A1Weapon;
import day08.mypac.Scope;
import day08.mypac.Weapon;

public class MainClass01 {
	
	public static void main(String[] args) {
		AKWeapon ak47 = new AKWeapon();
		ak47.attack();
		ak47.printType();
		
		
		
		Weapon ak47_2 = new AKWeapon();
		ak47_2.attack();
//		ak47_2.printType();
		
		
		// Call by reference (주소값 복사, 얕은 복사)
		AKWeapon ak47_3 = (AKWeapon) ak47_2;
		ak47_3.printType();
		
		M4A1Weapon m4a1 = new M4A1Weapon();
		
		System.out.println(System.identityHashCode(ak47));
		System.out.println(System.identityHashCode(ak47_2));
		System.out.println(System.identityHashCode(ak47_3));
		
		classyfiWeapon(ak47);
		classyfiWeapon(ak47_2);
		classyfiWeapon(ak47_3);
		classyfiWeapon(m4a1);
	}

	public static void classyfiWeapon(Weapon weapon) {
		if(weapon instanceof Scope) {
			System.out.println("저격 소총 입니다");
		} else {
			System.out.println("일반 소총 입니다");
		}
	}
	
	
}
