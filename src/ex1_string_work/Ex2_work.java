package ex1_string_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// @앞글자의 길이가 6이상 10이하 일 때만 올바른 이메일 임을 판별하기
		
		// 이메일 : abc@na.com 입력
		// 이메일 형식이 올바르지 않습니다
		
		// 이메일 : aabbcc@na.com 입력
		// aabbcc님 환영합니다!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력하세요 :");
		
		String email = sc.next();
		
		// case : 1
		if(email.indexOf('@') >=0)
		{
			String len = email.substring(0, email.indexOf('@'));
						
			if(len.length() >=6 && len.length() <=10)
			{
				System.out.println(len + "님 환영합니다!");
			} else {
				System.out.println("이메일 형식이 올바르지 않습니다.");
			}
		} else {
			System.out.println("이메일 형식이 올바르지 않습니다.");
		}
		
		// case : 2
//		String[] arr = email.split("@");
//		
//		if(arr[0].length() >=6 && arr[0].length() <=10)
//		{
//			System.out.println(arr[0] + "님 환영합니다!");
//		} else {
//			System.out.println("이메일 형식이 올바르지 않습니다.");
//		}
	}
}
