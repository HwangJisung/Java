package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// ��ĳ�ʸ� ���ؼ� ���� n1, n2�� ���� �Է� �޴´�
		// �׸��� n1 ~ n2������ ���� ����Ͽ� ����� ���
		// ex) 2�� 5�� �޾Ҵٸ� 2+3+4+5�� �������� 14�� ���
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("�Է� ���� n1: ");
		int n1 = sc.nextInt();

		System.out.print("�Է� ���� n2: ");
		int n2 = sc.nextInt();
		int n1_origin = n1;
		int n2_origin = n2;
		
		if(n1 < n2 )
		{
			for(; n1 <= n2; n1++)
			{
				sum += n1;
			}		
			System.out.printf("%d���� %d������ �� ��� : %d",n1_origin,n2, sum);
			
		} else if (n2>n1){
			System.out.println("n1�� ���� n2�� ������ �۾ƾ��մϴ�.");
			for(; n2 <= n1; n2++)
			{
				sum += n2;
			}		
			System.out.printf("%d���� %d������ �� ��� : %d",n1,n2_origin, sum);
		} else {
			System.out.printf("%d���� %d������ �� ��� : %d",n1,n2, n1+n2);
		}
	}
}
