package day05.method;

public class MainClass02 {
	private static String name; // �������� name ����
	
	public static void main(String[] args) {
		setName("�Ḹ��");
		
		String name = getName();
		
		System.out.println("name : " + name);
		
		int[] nums = {1, 2, 3};
		int resultsum = sum(nums);
		System.out.println(resultsum);
		
		int resultsum2 = sum(1,2,3);
		System.out.println(resultsum2);
		
	}

	
	// ���ڰ� X, ���ϰ� O
	public static String getName() {
		return name; 
	}
	
	public static void setName(String name) {
		MainClass02.name = name;
	}
	
	// ���ڰ� O, ���ϰ� O
	public static int sum(int[] args) {
		int sum = 0;
		for(int arg : args) {
			sum += arg;
			
		}
		return sum;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
