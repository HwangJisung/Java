package ex2_while;

public class Ex1_while {
	public static void main(String[] args) {
		// while�� : ������ ������ ���� �ݺ���
		// �� �� �� ó��
		// while( ���ǽ� ) {
		//	���ǽ��� ���϶� ����Ǵ� ����
		// }
		
		int num = 1;
		
		while ( num <= 5 ) {
			if( num % 2 == 0)
				System.out.println(num);
			num++;
		}
	}
}
