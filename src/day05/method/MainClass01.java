package day05.method;

/*
 * [[ �޼ҵ�(method) ]] 
 * � Ư�� �۾��� �����ϱ� ���� ��ɹ��� ����.
 * ��ü�� ��ɿ����� �Ѵ�.
 * 
 * �޼ҵ� ����
 * (����������) (����) ��ȯŸ�� �޼ҵ��̸�(�Ű�����Ÿ�� �Ű�������) { //�����
 * 		������ �ڵ�(��ɺ�)  // ������
 * 	...
 * 
 * 	return ��ȯ��;
 * }
 * 
 * �����ε�(Overloading)
 * 		Ŭ���� ������ ���� �̸��� ���� �޼ҵ带 ������ �����ϴ� ���� ���Ѵ�.
 * 		�Ű����� ���� �Ǵ� Ÿ���� �ٸ��� �ȴ�.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		hello(); //�޼ҵ� ȣ��
		
		printName("123");
		
		printMember("HANA", "�ϳ�", 18, "�л�");
		
		String[] PokeMon = {"��ī��", "������", "���̸�", "���α�"};
		printPokemon(PokeMon);
		
		//System.out.println(String.valueOf(false));
		//System.out.println(String.valueOf(10));
		//System.out.println(String.valueOf(10.3));
	}
	
	// ���ڰ� X, ���ϰ� X -> ȣ��� �����ϰ� ������ �޼ҵ� 
	public static void hello () {
		System.out.println("Hello, World!");
	}
	
	// ���ڰ� O, ���ϰ� X -> ���ڰ��� �޾� �����ϰ� ������ �޼ҵ�
	public static void printName(String name) { // String name = "123";
		System.out.println("�̸� : "+ name);
	}
	
	// ���ڰ� O ����Ÿ�� ������, ���ϰ� X
	public static void printMember(String id, String name, int age) {
		System.out.println("ID : "+ id);
		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+ age);
	}
	
	// �����ε�(overloading) �޼ҵ�
	// ���ڰ� O, ����Ÿ�� ������, ���ϰ� X
	public static void printMember(String id, String name, int age, String job) {
		System.out.println("ID : "+ id);
		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+ age);
		System.out.println("���� : "+ job);
	}
	
	// ���� O, �迭, ���ϰ� X
	public static void printPokemon(String[] mons) {
		for(String mon : mons) {
			System.out.println(mon);
		}
	}
}
