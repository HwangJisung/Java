package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		// switch문  : 조건식이 아닌 값을 직접 비교하여 결과를 처리하는 제어문
		// 조건값들은 서로 중복될 수 없다.
		// 비교값은 정수(byte, short, int), 문자(char), 문자열(String)
		
		// switch( 비교값 ){
		//	case 조건값 :
		// 		비교값과 조건값이 일치하면 실행되는 영역
		//		break;
		// }
		
		int n = 2;
		
		String str = "";
		
		switch (n) {
		case 1:
			str = "n은 1";
			break;
			
		case 2:
			str = "n은 2";
			break;

		case 3:
			str = "n은 3";
			break;

		default:
			// 비교값과 조건값이 모두 일치하지 않을 때 실행되는 영역
			str = "n은 case 문 안에 없음";
			break;
		}
		System.out.println( str );
	}
}
