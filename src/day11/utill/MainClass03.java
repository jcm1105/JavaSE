package day11.utill;

import java.util.Vector;

/*
 * [[ Vector Class ]]
 * �����迭 ��ü
 * ArrayList�� ����
 * Thread safe - synchronized
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		
		// �߰�
		vec.add("��ī��");
		vec.add("������");
		vec.add("���̸�");
		System.out.println("����� ������ ���� : " + vec.size());
	    
		// ������ ��������
		System.out.println("1�� �ε��� ������ �������� : " + vec.get(1)); // ������ �������� ����
		
		
	}

}
