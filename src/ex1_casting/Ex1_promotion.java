package ex1_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		// ĳ����(����ȯ)
		// 1. ���θ�� ĳ����
		// - ū �ڷ����� ���� �ڷ����� �����ϴ� ��(�ڵ�)
		double d = 100.5;
		int n = 200;
		d=n;
		
		System.out.println(d);
		
		char c = 'A';  // 2byte
		long lo = 100; // 8byte
		lo = c;
		
		System.out.println(lo);
	}
}
