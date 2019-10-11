package ex2_multi_array;

public class Ex3_MultiArray {
	public static void main(String[] args) {
		int [][] arr = { {16,5 }, {22,33,90,763}, {44,11,48,378}, {55,33} };
		
		int sum = 0;
		int cnt = 0;
		float avr = 0.0f;
		
		// 2차원 배열 arr에 담긴 모든 값의 합과 평균을 출력
		for(int i =0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{				
				sum += arr[i][j];

				cnt ++;
			}
		}
		avr = (float)sum /cnt;
		
		System.out.println("배열에 담긴 모든 값의 합 : " + sum);
		System.out.printf("배열에 담긴 모든 값의 평균 : %.3f" , avr);
		
		
		// Wrapper 클래스의 종류
		// int -> Integer
		// char -> Character
		// boolean -> Boolean
		// byte -> Byte
		// short -> Short
		// string -? String
		// 기본 자료형에서 대문자로 시작하는 것을 wrapper클래스
		
	}
}
