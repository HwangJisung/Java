package ex1_array;

public class Ex1_array {
	public static void main(String[] args) {
		// 배열 : 같은 자료형끼리 모아두는 하나의 묶음
		// 효율적인 자료관리를 위해 반드시 필요!!		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		// 위의 자료를 배열로 관리해보자
		// 1) 배열 선언
		//int[] arr;
		
		// 2) 선언된 배열을 생성
		//arr = new int[4];
				
		// 2.5) 배열의 선언과 생성을 동시에
		int[] arr = new int[4];
		
		// 3) 배열 초기화
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		//arr[4] = 500; <- 배열에 존재하지 않는 index는 사용할 수 없다.
		
		// 배열이가지고 있는 모든 내용을 화면에 출력
		for(int i =0; i<arr.length; i++)
		{
			System.out.printf("arr[%d] : %d\n",i, arr[i]);
		}
		
		
	}
}
