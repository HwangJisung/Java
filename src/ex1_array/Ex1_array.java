package ex1_array;

public class Ex1_array {
	public static void main(String[] args) {
		// �迭 : ���� �ڷ������� ��Ƶδ� �ϳ��� ����
		// ȿ������ �ڷ������ ���� �ݵ�� �ʿ�!!		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		// ���� �ڷḦ �迭�� �����غ���
		// 1) �迭 ����
		//int[] arr;
		
		// 2) ����� �迭�� ����
		//arr = new int[4];
				
		// 2.5) �迭�� ����� ������ ���ÿ�
		int[] arr = new int[4];
		
		// 3) �迭 �ʱ�ȭ
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		//arr[4] = 500; <- �迭�� �������� �ʴ� index�� ����� �� ����.
		
		// �迭�̰����� �ִ� ��� ������ ȭ�鿡 ���
		for(int i =0; i<arr.length; i++)
		{
			System.out.printf("arr[%d] : %d\n",i, arr[i]);
		}
		
		
	}
}
