package ex1_string_work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		// 회문수 판단하기
		// 회문수란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 숫자를 말한다.
		// ex)121 2332
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		String str = sc.next(); // 원본값을 str에 저장
		String str_reverse = ""; // 원본을 뒤집어서 저장할 변수
		
		//원본을 뒤집어서 str2에 저장하는 작업
		for(int i=str.length() - 1; i>=0; i--) {
			str_reverse += str.charAt(i);
		}
		
		if(str.equals(str_reverse)) System.out.println(str + "은(는) 회문수가 맞습니다.");
		else System.out.println(str + "은(는) 회문수가 아닙니다.");
	}
}
