package day07.mypac;

public class SlidePhone extends Phone {
	
	public SlidePhone() {
		this.model = "�����̵� ��ȭ��";
		
	}
		public void sendMessage() {
			
			new CellPhone().sendMessage();
		}
		
		void telelcomInternet() {
			System.out.println("��Ż� ���ͳ� ����!");
		}
}
