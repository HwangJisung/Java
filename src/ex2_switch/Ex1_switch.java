package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		// switch��  : ���ǽ��� �ƴ� ���� ���� ���Ͽ� ����� ó���ϴ� ���
		// ���ǰ����� ���� �ߺ��� �� ����.
		// �񱳰��� ����(byte, short, int), ����(char), ���ڿ�(String)
		
		// switch( �񱳰� ){
		//	case ���ǰ� :
		// 		�񱳰��� ���ǰ��� ��ġ�ϸ� ����Ǵ� ����
		//		break;
		// }
		
		int n = 2;
		
		String str = "";
		
		switch (n) {
		case 1:
			str = "n�� 1";
			break;
			
		case 2:
			str = "n�� 2";
			break;

		case 3:
			str = "n�� 3";
			break;

		default:
			// �񱳰��� ���ǰ��� ��� ��ġ���� ���� �� ����Ǵ� ����
			str = "n�� case �� �ȿ� ����";
			break;
		}
		System.out.println( str );
	}
}
