package day06.mypac;

public class HandPhone {
	public String model;
	
	static{
		System.out.println("static �ʱ�ȭ ��");
	}
	
	{
		System.out.println("�ʱ�ȭ ��");
		// �����ں��� ��������
	}
	
	// ������
	public HandPhone() {
		model = "������S23";
		printmodel();
	}
	
	// ������ �����ε�
	public HandPhone(String model) {
		this.model = model;
		printmodel();
	}
	
	public void printmodel() {
		System.out.println(this.model);
	}
	
}
