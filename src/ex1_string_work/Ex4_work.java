package ex1_string_work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		// ȸ���� �Ǵ��ϱ�
		// ȸ������ ������ �о �ڷ� �о �Ȱ��� ������ ���ڸ� ���Ѵ�.
		// ex)121 2332
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		String str = sc.next(); // �������� str�� ����
		String str_reverse = ""; // ������ ����� ������ ����
		
		//������ ����� str2�� �����ϴ� �۾�
		for(int i=str.length() - 1; i>=0; i--) {
			str_reverse += str.charAt(i);
		}
		
		if(str.equals(str_reverse)) System.out.println(str + "��(��) ȸ������ �½��ϴ�.");
		else System.out.println(str + "��(��) ȸ������ �ƴմϴ�.");
	}
}
