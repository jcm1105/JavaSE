package day07.mypac;

public class Dog extends Animal {
	
	// �����ε� ������~!!
	public Dog(String name) {
		System.out.println(name + "Dog ������ �Դϴ�");
	}
	public void bark() {
		System.out.println("bow wow~");
	}

	@Override
	public void move() {
		// �θ� ��� ���� ���� ����� super
		System.out.print("Ȱ���ϰ�~");
		super.move();  
		
	}
	
	public String getOwner() {
		return super.owner;
	}
	
}
