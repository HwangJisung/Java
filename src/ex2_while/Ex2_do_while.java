package ex2_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		// do-while : �� ó��, �� ��
		// ��� �� �����ϰ� ; ���� ����
		// do {
		//	���ǽ��� ���� �� ����Ǵ� ����
		// } while( ���ǽ� );
		
		int i = 7;
		do {
			System.out.println(i);
			i++;
		} while ( i <= 10);
		
		System.out.println("------------");
		
		// �ڹ�, jsp , �ȵ���̵��� ���� ������  0 ~ 130������ �����ϰ� ����Ѵ�.
		// �� ���� ������ do-while�� �˻��Ͽ� �� ������ ������ ��� 
		// 0 ~ 100������ ���� ���� ��쿡�� ȭ�鿡 ����ϼ���
		int java = 0;
		int android = 0;
		int jsp = 0;
		
		do {
			java = new Random().nextInt(131); // 0 ~ 130 ������ ����
			android = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			
			if(java <=100 && android <=100 && jsp <=100)
			{
				System.out.println("java :" + java);
				System.out.println("�ȵ���̵� :" + android);
				System.out.println("jsp :" + jsp);
				System.out.println("------------");
			}
		} while (java <=100 && android <=100 && jsp <=100);
	}
}
