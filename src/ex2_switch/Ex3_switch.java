package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		// 변수 month에 원하는 달을 대입하고 해당 달이 몇일까지 있는지 출력하세요
		int month = 5;
		String str = "";

		switch (month) {
		case 2:
			str = "28일까지 있습니다.";
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			str = "30일까지 있습니다.";
			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			str = "31일까지 있습니다.";
			break;

		default:
			str = "잘못 입력 하셨습니다.";
			break;
		}
		System.out.println(month + "월은 " + str);
	}
}
