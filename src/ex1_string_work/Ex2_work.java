package ex1_string_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// @�ձ����� ���̰� 6�̻� 10���� �� ���� �ùٸ� �̸��� ���� �Ǻ��ϱ�
		
		// �̸��� : abc@na.com �Է�
		// �̸��� ������ �ùٸ��� �ʽ��ϴ�
		
		// �̸��� : aabbcc@na.com �Է�
		// aabbcc�� ȯ���մϴ�!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸����� �Է��ϼ��� :");
		
		String email = sc.next();
		
		// case : 1
		if(email.indexOf('@') >=0)
		{
			String len = email.substring(0, email.indexOf('@'));
						
			if(len.length() >=6 && len.length() <=10)
			{
				System.out.println(len + "�� ȯ���մϴ�!");
			} else {
				System.out.println("�̸��� ������ �ùٸ��� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("�̸��� ������ �ùٸ��� �ʽ��ϴ�.");
		}
		
		// case : 2
//		String[] arr = email.split("@");
//		
//		if(arr[0].length() >=6 && arr[0].length() <=10)
//		{
//			System.out.println(arr[0] + "�� ȯ���մϴ�!");
//		} else {
//			System.out.println("�̸��� ������ �ùٸ��� �ʽ��ϴ�.");
//		}
	}
}
