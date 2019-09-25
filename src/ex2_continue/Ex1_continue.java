package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		// continue문 : 반복문 내에서 특정 문장을 강제로 건너뛰고자 할 때 사용하는 키워드
		
		for( int i = 1; i <=3; i++) {
			
			if( i == 2) {
				// for문 안에서 continue가 사용되면 가까운 for문의 증감식으로 건너뛴다.
				continue;
				// break문과 마찬가지로 continue문 바로 아래에는 어떤 코드도 동작할 수 없다.
			}
			System.out.println( i );
		}
		
		System.out.println("===================");
		
		for(int i=0; i<3;) {
			i++;			
			if( i == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
}
