package day07.accessmodifier;

import day07.mypac.CellPhone;
import day07.mypac.Phone;
import day07.mypac.SlidePhone;
import day07.mypac2.SmartPhone;

/*
 * [[ ���������� / ���������� ]]
 * public - ��� Ŭ�������� ���� ����
 * protected - ���� ��Ű�� �Ǵ� ��� ���迡�� ���� ����
 * default - ���� ��Ű�� ���� ����
 * private - ���� Ŭ���� �ȿ��� ���� ����
 * 
 * 
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		
		System.out.println("�𵨸� : " + phone.model);
		CellPhone cellphone = new CellPhone();
		SlidePhone slidephone = new SlidePhone();
		SmartPhone smartphone = new SmartPhone();
		
		System.out.println("�𵨸� : " + phone.model);
		System.out.println("�𵨸� : " + cellphone.model);
		System.out.println("�𵨸� : " + slidephone.model);
		System.out.println("�𵨸� : " + smartphone.getModel());
		
//		cellphone.sendMessage();  //protected �ٸ���Ű�� ���� �Ұ�
		slidephone.sendMessage();
//		slidePhone.telecomInternet(); // default �ٸ���Ű�� ���� �Ұ�
		smartphone.videoMessage();
	}

}
