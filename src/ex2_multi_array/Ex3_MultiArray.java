package ex2_multi_array;

public class Ex3_MultiArray {
	public static void main(String[] args) {
		int [][] arr = { {16,5 }, {22,33,90,763}, {44,11,48,378}, {55,33} };
		
		int sum = 0;
		int cnt = 0;
		float avr = 0.0f;
		
		// 2���� �迭 arr�� ��� ��� ���� �հ� ����� ���
		for(int i =0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{				
				sum += arr[i][j];

				cnt ++;
			}
		}
		avr = (float)sum /cnt;
		
		System.out.println("�迭�� ��� ��� ���� �� : " + sum);
		System.out.printf("�迭�� ��� ��� ���� ��� : %.3f" , avr);
	}
}
