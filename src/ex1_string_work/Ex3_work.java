package ex1_string_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		// �Ʒ��� ���� ����� �ݿ��ϴ� �ڵ� �ۼ��ϱ�
		// ��� )
		// �ֹι�ȣ�� �Է��ϼ��� (- ����)
		// >> 991122-1202321
		// ����� 1999�� 11�� 22�� �¾ �����Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ(- ����)�� �Է��ϼ��� :");
		
		String id = sc.next();
		
		if (id.trim().length() < 14 || id.trim().charAt(6) != '-')
		{
			System.out.println("�ֹε�Ϲ�ȣ ������ �ƴմϴ�.");
		} else {			
			int gubun = Integer.parseInt(id.substring(7,8));
			
			String year = "";
			String gubun2 = "";
			
			year = (gubun == 1 || gubun == 2) ? "19" : "20";
			gubun2 = (gubun == 1 || gubun == 3) ? "����" : "����";   
			
			System.out.printf("����� %s%s�� %s�� %s�� �¾ %s�Դϴ�" , year, id.substring(0, 2), id.substring(2, 4), id.substring(4, 6), gubun2);
		}
		
	}
}
