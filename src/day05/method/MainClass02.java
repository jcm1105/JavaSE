package day05.method;

public class MainClass02 {
	private static String name; // 전역변수 name 선언
	
	public static void main(String[] args) {
		setName("잠만보");
		
		String name = getName();
		
		System.out.println("name : " + name);
		
		int[] nums = {1, 2, 3};
		int resultsum = sum(nums);
		System.out.println(resultsum);
		
		int resultsum2 = sum(1,2,3);
		System.out.println(resultsum2);
		
	}

	
	// 인자값 X, 리턴값 O
	public static String getName() {
		return name; 
	}
	
	public static void setName(String name) {
		MainClass02.name = name;
	}
	
	// 인자값 O, 리턴값 O
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
