package ex1_break;

public class Ex2_break {
	public static void main(String[] args) {
		
		for( int i = 0; i <= 2; i++ ) {
			switch (i) {
			case 0:
				System.out.println("0을 출력하겠습니다.");
				// 반복문 내부의 switch문이라도 break는 switch문 만 빠져나갈수 있다.
				break;
			case 1:
				System.out.println("1을 출력하겠습니다.");
				break;
			case 2:
				System.out.println("2를 출력하겠습니다.");
				break;
			default:
				break;
			}
		}
	}
}
