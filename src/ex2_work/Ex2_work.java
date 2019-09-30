package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// 스캐너를 통해서 정수 n1, n2에 값을 입력 받는다
		// 그리고 n1 ~ n2까지의 합을 계산하여 결과를 출력
		// ex) 2와 5를 받았다면 2+3+4+5의 연산결과인 14를 출력
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("입력 정수 n1: ");
		int n1 = sc.nextInt();

		System.out.print("입력 정수 n2: ");
		int n2 = sc.nextInt();
		int n1_origin = n1;
		int n2_origin = n2;
		
		if(n1 < n2 )
		{
			for(; n1 <= n2; n1++)
			{
				sum += n1;
			}		
			System.out.printf("%d부터 %d까지의 합 결과 : %d",n1_origin,n2, sum);
			
		} else if (n2>n1){
			System.out.println("n1의 값은 n2의 값보다 작아야합니다.");
			for(; n2 <= n1; n2++)
			{
				sum += n2;
			}		
			System.out.printf("%d부터 %d까지의 합 결과 : %d",n1,n2_origin, sum);
		} else {
			System.out.printf("%d부터 %d까지의 합 결과 : %d",n1,n2, n1+n2);
		}
	}
}
