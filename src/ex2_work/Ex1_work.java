package ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// ��ĳ�ʸ� ���� Ű���忡�� ���� n�� �Է¹޴´�.
		// �׸��� 1���� n������ ���� ����Ͽ� ����� ���.
		// ex) ���� : 5
		//     ��� : 15
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("�Է� ���� : ");
		int inputNum = sc.nextInt();
		
		for(int i=1; i <= inputNum; i++)
		{
			sum += i;
		}
		
		System.out.printf("1���� %d������ �� ��� : %d",inputNum, sum);
	}
}
