package day03.conditional;

public class MainClass05 {
	public static void main(String[] args) {
		
		// 01 : ȯ�ҽ�û��
		// 02 : ȯ��ó����
		// 03 : ȯ�����
		// 04 : ������ü��
		// 05 : ȯ�ҿϷ�
		// 01, 02, 04 �����϶� ȯ�� �Ұ�!
		
		String rtCd = "02";
		switch(rtCd) {
		case "01":
		case "02":
		case "04":
			System.out.println("ȯ�� �Ұ�!!");
			System.out.println("ȯ�� ���� �ڵ�:" + rtCd);
			break;
		}
		
		if(rtCd.contentEquals("01") ||
				rtCd.contentEquals("02") ||
				rtCd.contentEquals("04") 
		) {
			System.out.println("ȯ�ҺҰ�");
			System.out.println("ȯ�� ���� �ڵ�:" + rtCd);
		}
	}

}
