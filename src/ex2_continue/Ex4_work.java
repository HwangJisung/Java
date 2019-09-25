package ex2_continue;

public class Ex4_work {
	public static void main(String[] args) {
		// 1~ 1000까지의 정수 중 3의 배수끼리만 더한 값을 출력하시오
		// 결과 : 166833
		int i = 1;
		int sum = 0;
		
		while ( i <= 1000)
		{
			if( i % 3 == 0)
				sum = sum + i;
			i++;
		}
		System.out.println("결과 : "+ sum);
	}
}
