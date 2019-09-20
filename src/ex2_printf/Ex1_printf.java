package ex2_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		// ��� ������ �����ϴ� printf()
		System.out.printf("%d * %d = %d\n",2,1,2);
		System.out.println("==========");
		
		//2019-09-20
		//2019/09/20
		int year = 2019;
		int month = 9;
		int day = 20;
		
		System.out.printf("%d-%02d-%d\n",year,month,day);
		System.out.println("==========");
		System.out.printf("%d/%02d/%d\n",year,month,day);
		System.out.println("==========");
		
		/*
		 * %d : ���� �����͸� ���
		 * %c : ���� �����͸� ��� 
		 * %s : ���ڿ� ������ ���
		 * %f : �Ǽ� ������ ���
		 * */
		// ȫ�浿���� 3.7�������� A�� �ش�˴ϴ�.
		
		String name = "ȫ�浿";
		float score = 3.7f;
		char res = 'A';
		
		System.out.printf("%s���� %.1f�������� %c�� �ش�˴ϴ�.",name,score,res);
	}
}
