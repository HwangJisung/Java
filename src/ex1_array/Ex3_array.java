package ex1_array;

public class Ex3_array {
	public static void main(String[] args) {

		// �迭�� ���� , ���� , �ʱ�ȭ�� �ѹ���!!
		//char[] cArr = {'H','E','L','L','O'};
		int[] arr = {10,20,30,40,50};
		
		// �迭 arr�� ��� ��� ���� ���� ���
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum +=arr[i];
		}
		System.out.println("�迭�� ��� ��� ���� ���� : "+ sum + " �Դϴ�.");
	}
}
