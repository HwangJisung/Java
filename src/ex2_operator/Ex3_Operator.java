package ex2_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
		// ����������
		// 1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
		// ���� ������ ���� ������ �������� ���
		int a = 10;
		
		System.out.println("++a :" + ++a);
		
		int b = 10;
		System.out.println("b++ :" + b++);
		System.out.println("b :" + b);
		
		// ����(����)������
		// �ϳ��� ������ �����Ͽ� �� ������ ���϶��� �����϶��� ���� ����� ��� �����ޱ� ���� ������ :
		
		int n1 = 10;
		int n2 = 15;
		
		boolean result;
		result = ++n1 >= n2 ? true : false;
		
		System.out.println("result :" + result);
		
		char res = (n1 += n1) != n2 ? 'O' : 'X';
		
		System.out.println("res : " + res);
		
		a = 10;
		b = 12;
		int c = ++a >= b || 2 + 7 <= b && 13 - b > 0 && ( a += b) > 22 ? 1 : 2; // 1
		
		System.out.println("c : " + c);
				
	}
}
