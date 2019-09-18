package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		char c = '미';
		String str = "";
		
		switch (c) {
		case '수':
			str = "91 ~ 100 점";
			break;

		case '우':
			str = "81 ~ 90 점";
			break;

		case '미':
			str = "71 ~ 80 점";
			break;

		case '양':
			str = "61 ~ 70 점";
			break;

		case '가':
			str = "0 ~ 60 점";
			break;
			
		default:
			str = "성적 case에 맞지 않음";
			break;
		}
		
		System.out.println("내 점수는 요 : " + str );
	}
}
