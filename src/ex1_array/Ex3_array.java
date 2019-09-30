package ex1_array;

public class Ex3_array {
	public static void main(String[] args) {

		// 배열의 선언 , 생성 , 초기화를 한번에!!
		//char[] cArr = {'H','E','L','L','O'};
		int[] arr = {10,20,30,40,50};
		
		// 배열 arr에 담긴 모든 값의 합을 출력
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum +=arr[i];
		}
		System.out.println("배열에 담긴 모든 값의 합은 : "+ sum + " 입니다.");
	}
}
