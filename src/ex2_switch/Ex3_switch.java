package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		// ���� month�� ���ϴ� ���� �����ϰ� �ش� ���� ���ϱ��� �ִ��� ����ϼ���
		int month = 5;
		String str = "";

		switch (month) {
		case 2:
			str = "28�ϱ��� �ֽ��ϴ�.";
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			str = "30�ϱ��� �ֽ��ϴ�.";
			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			str = "31�ϱ��� �ֽ��ϴ�.";
			break;

		default:
			str = "�߸� �Է� �ϼ̽��ϴ�.";
			break;
		}
		System.out.println(month + "���� " + str);
	}
}
