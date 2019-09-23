package ex2_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		// do-while : 선 처리, 후 비교
		// 제어문 중 유일하게 ; 으로 종료
		// do {
		//	조건식이 참일 때 실행되는 영역
		// } while( 조건식 );
		
		int i = 7;
		do {
			System.out.println(i);
			i++;
		} while ( i <= 10);
		
		System.out.println("------------");
		
		// 자바, jsp , 안드로이드의 시험 점수를  0 ~ 130점으로 랜덤하게 배분한다.
		// 각 과목별 점수는 do-while로 검사하여 세 과목의 점수가 모두 
		// 0 ~ 100이하의 값이 나온 경우에만 화면에 출력하세요
		int java = 0;
		int android = 0;
		int jsp = 0;
		
		do {
			java = new Random().nextInt(131); // 0 ~ 130 사이의 난수
			android = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			
			if(java <=100 && android <=100 && jsp <=100)
			{
				System.out.println("java :" + java);
				System.out.println("안드로이드 :" + android);
				System.out.println("jsp :" + jsp);
				System.out.println("------------");
			}
		} while (java <=100 && android <=100 && jsp <=100);
	}
}
