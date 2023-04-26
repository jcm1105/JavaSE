package day15.network;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * [[ URL(Uniform Resource Locator) ]]
 * 	 ���ͳݿ��� �� ������, �̹���, ������ ��� ���� ���ҽ��� ã�� �� �ִ� �ּ�
 * 
 * ��������(protocol)
 * 	 ��ǻ�� ��Ʈ��ũ�� ���� ����� �����ϱ� ���� ǥ�� ��Ģ, ����, Ȥ�� ��� ���μ����� �ǹ�
 *   ex) http/https - ������ ��������
 *       ftp - ���ϼ��� ��������
 *       mailto - ���ڸ��� ���� ��������
 *       telnet - ������ ���� �������� 
 *       
 * ȣ��Ʈ(host)
 * 	 ���ҽ��� ��ġ�� ������ �̸�
 *   ex) www.ytn.co.kr
 *    
 * ��Ʈ(port)
 * 	 �������� ����ϴ� ���񽺳� ���� ���α׷��� �Ҵ�� ��ȣ
 *   ex) 80(http default) / 443(https default)
 *   
 * ���(path)
 * 	 �� �������� �ڿ��� ���� ��� (������ �Ǵ� �߻��� ���)
 * 	 ex) /_ln/0103_202304261841578698 
 * 	     / ���1 / ���2 / �������̸�.html 
 *   	 /upload/2023/4/14/upload_2023414483
 *   
 * ����(query)
 * 	 �߰��� ������ ������ �Ķ���� (����ǥ ��)
 * 	 ex) ?ntype=RANKING
 * 	     ?key1=value1&key2=value2....&keyN=valueN
 * 
 * ���۷���(reference)
 * 	 �������� ���� Ư�� ���� �Ǵ� ���� Ư����ġ
 *   ex) #body
 * 
 * [[ URL Class ]]
 *	 URL Ŭ������ ����Ͽ� �������� ���ҽ�, �̹���, ������, REST API �� �����͸� ������ �� �ִ�
 * 
 */
public class MainClass02 {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://www.ytn.co.kr/_ln/0103_202304261841578698");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();

		System.out.println("protocol : " + protocol);
		System.out.println("host : " + host);
		System.out.println("query : " + query);
		System.out.println("reference : " + reference);
		System.out.println("port : " + port);
		System.out.println("path : " + path);
	}

}
