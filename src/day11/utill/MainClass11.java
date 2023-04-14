package day11.utill;

import java.util.Calendar;

/*
 * [[ Calendar Class ]]
 * ��¥ ���� ��ü
 * ��¥ �������� ���� ���
 * Date ��ü�� ȣȯ ����
 * 
 */
public class MainClass11 {
	public static void main(String[] args) {
		// Calendar ��ü ����
		// getInstance �޼ҵ带 ���ؼ��� ��ü ���� ����
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("�� �� : " + year);
		
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println("�� : " + month);
		
		int day = cal.get(Calendar.DAY_OF_MONTH );
		System.out.println("�� : " + day);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(hour + ":" + min + ":" + sec);
	}

}
