package day07.mypac;

//추상 클래스
public abstract class Human {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void say() {
		System.out.println("말을 해요!");
	}

	public abstract void useFire();
	
	
}
