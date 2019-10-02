package ex2_multi_array;

public class Ex1_MultiArray {
	public static void main(String[] args) {
		// 다차원 배열
		// 1차원 배열이 2개 모이면 2차원 배열
		// 1차원 배열이 3개 모이면 3차원 배열
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		// 60이라는 값을 70으로 수정
		arr[1][2] = 70;
		
		System.out.println(arr[1][2]);
		System.out.println("--------------");
		
		//2차원 배열 arr이 가지고 있는 모든 데이터를 출력
		for(int i=0; i < arr.length; i++)
		{
			for(int j=0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
