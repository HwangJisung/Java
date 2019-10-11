package ex1_string_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		// 아래와 같은 결과를 반영하는 코드 작성하기
		// 결과 )
		// 주민번호를 입력하세요 (- 포함)
		// >> 991122-1202321
		// 당신은 1999년 11월 22일 태어난 남자입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(- 포함)를 입력하세요 :");
		
		String id = sc.next();
		
		if (id.trim().length() < 14 || id.trim().charAt(6) != '-')
		{
			System.out.println("주민등록번호 형식이 아닙니다.");
		} else {			
			int gubun = Integer.parseInt(id.substring(7,8));
			
			String year = "";
			String gubun2 = "";
			
			year = (gubun == 1 || gubun == 2) ? "19" : "20";
			gubun2 = (gubun == 1 || gubun == 3) ? "남자" : "여자";   
			
			System.out.printf("당신은 %s%s년 %s월 %s일 태어난 %s입니다" , year, id.substring(0, 2), id.substring(2, 4), id.substring(4, 6), gubun2);
		}
		
	}
}
