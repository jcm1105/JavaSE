package day08.polymorphism;
/*
 * [[ ������ (polymorphism)
 * �ϳ��� ��ü�� �������� Ÿ���� ���� �� �ִ� ���� �ǹ�
 * 
 * instanceof ������
 * 	��ü�� Ư�� Ŭ���� �Ǵ� �������̽��� �ν��Ͻ����� ���θ� Ȯ���ϴµ� ���!
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
		
		
		// Call by reference (�ּҰ� ����, ���� ����)
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
			System.out.println("���� ���� �Դϴ�");
		} else {
			System.out.println("�Ϲ� ���� �Դϴ�");
		}
	}
	
	
}
