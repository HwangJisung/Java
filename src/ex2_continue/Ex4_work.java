package ex2_continue;

public class Ex4_work {
	public static void main(String[] args) {
		// 1~ 1000������ ���� �� 3�� ��������� ���� ���� ����Ͻÿ�
		// ��� : 166833
		int i = 1;
		int sum = 0;
		
		while ( i <= 1000)
		{
			if( i % 3 == 0)
				sum = sum + i;
			i++;
		}
		System.out.println("��� : "+ sum);
	}
}
