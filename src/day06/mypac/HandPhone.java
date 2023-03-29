package day06.mypac;

public class HandPhone {
	public String model;
	
	static{
		System.out.println("static 초기화 블럭");
	}
	
	{
		System.out.println("초기화 블럭");
		// 생성자보다 먼저실행
	}
	
	// 생성자
	public HandPhone() {
		model = "갤럭시S23";
		printmodel();
	}
	
	// 생성자 오버로딩
	public HandPhone(String model) {
		this.model = model;
		printmodel();
	}
	
	public void printmodel() {
		System.out.println(this.model);
	}
	
}
