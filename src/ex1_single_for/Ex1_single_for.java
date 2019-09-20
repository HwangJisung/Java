package ex1_single_for;

public class Ex1_single_for {
	public static void main(String[] args) {
		// for문 : 특정 명령을 원하는 만큼 반복적으로 처리하고자 할 때 사용
		// for( 초기식; 조건식; 증감식 ){
		//	조건식이 참일 때 실행되는 영역
		// }
		
		for(int i=0; i<3; i++)
		{
			System.out.println("i : " + i);
		}
		
		System.out.println("============================");
		
		// 10부터 시작해서 1까지 감소하는 for문을 작성하세요
		for(int j=10; j>0; j--) {
			System.out.println("j : " + j);
		}

		System.out.println("============================");
		
		// 1부터 100까지 반복하는 for문에서 3의 배수만 화면에 출력
		for(int k=1; k<100; k++) {
			if(k % 3 == 0)
			{
				System.out.println("k : " + k);
			}
		}

		System.out.println("============================");
		
		// 1부터 100까지 반복하는 for문에서 3의 배수만 화면에 출력
		for(int a=3; a<100; a=a+3) {
			System.out.println("a : " + a);
		}
	}
}
