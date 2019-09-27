package ex1_scanner;

import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
		// 키보드에서 사용자 입력값 받기
		Scanner sc = new Scanner( System.in );
		
		System.out.print("정수 :");
		int num = sc.nextInt();
		
		System.out.println("입력 받은 정수값 : " + num);

		System.out.print("문자 :");		
		String str = sc.next();
		
		str +=1;
		
		System.out.println("입력 받은 문자값 : " + str);
		
	}
}
