package ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// 스캐너를 통해 키보드에서 정수 n을 입력받는다.
		// 그리고 1부터 n까지의 합을 계산하여 결과를 출력.
		// ex) 정수 : 5
		//     결과 : 15
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("입력 정수 : ");
		int inputNum = sc.nextInt();
		
		for(int i=1; i <= inputNum; i++)
		{
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 합 결과 : %d",inputNum, sum);
	}
}
