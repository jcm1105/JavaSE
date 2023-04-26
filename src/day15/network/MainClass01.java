package day15.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainClass01 {
	public static void main(String[] args) throws UnknownHostException {
		// InetAddress�� IP�� �����ϴ� Ŭ����
		// getLoacalHost() ���� �ý����� IP�� InetAddress ��ü�� ��ȯ
		InetAddress ia = InetAddress.getLocalHost();
		
		// getHostName() �� ȣ��Ʈ �̸��� ��ȯ
		System.out.println("host name: " + ia.getHostName());
		
		// getHostAddress() �� ȣ��Ʈ IP�� ��ȯ
		System.out.println("host ip: " + ia.getHostAddress());
		
		// getByName() �� Ư������Ʈ�� IP�� InetAddress�� ��ȯ
		ia = InetAddress.getByName("www.naver.com");
		
		System.out.println("host name: " + ia.getHostName());
		System.out.println("host ip: " + ia.getHostAddress());
	}

}
