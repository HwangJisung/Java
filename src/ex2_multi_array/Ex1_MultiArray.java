package ex2_multi_array;

public class Ex1_MultiArray {
	public static void main(String[] args) {
		// ������ �迭
		// 1���� �迭�� 2�� ���̸� 2���� �迭
		// 1���� �迭�� 3�� ���̸� 3���� �迭
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		// 60�̶�� ���� 70���� ����
		arr[1][2] = 70;
		
		System.out.println(arr[1][2]);
		System.out.println("--------------");
		
		//2���� �迭 arr�� ������ �ִ� ��� �����͸� ���
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
