package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		char c = '��';
		String str = "";
		
		switch (c) {
		case '��':
			str = "91 ~ 100 ��";
			break;

		case '��':
			str = "81 ~ 90 ��";
			break;

		case '��':
			str = "71 ~ 80 ��";
			break;

		case '��':
			str = "61 ~ 70 ��";
			break;

		case '��':
			str = "0 ~ 60 ��";
			break;
			
		default:
			str = "���� case�� ���� ����";
			break;
		}
		
		System.out.println("�� ������ �� : " + str );
	}
}
