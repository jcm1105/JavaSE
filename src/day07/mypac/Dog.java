package day07.mypac;

public class Dog extends Animal {
	
	// 오버로딩 생성자~!!
	public Dog(String name) {
		System.out.println(name + "Dog 생성자 입니다");
	}
	public void bark() {
		System.out.println("bow wow~");
	}

	@Override
	public void move() {
		// 부모 멤버 접근 가능 예약어 super
		System.out.print("활발하게~");
		super.move();  
		
	}
	
	public String getOwner() {
		return super.owner;
	}
	
}
