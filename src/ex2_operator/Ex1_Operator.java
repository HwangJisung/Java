package ex2_operator;

public class Ex1_Operator {
	public static void main(String[] args) {
		// ������(Operator)
		// 1. �ְ����� : . ()
		// 2. ���������� : ++ --
		// 3. ��������� : + - * / %
		// 4. ����Ʈ������ : >> << >>>
		// 5. �񱳿����� : > < >= <= == !=
		// 6. ��Ʈ������ : & | ^ ~
		// 7. �������� : && || !
		// 8. ����(����)������ : ? :
		// 9. ���Կ����� : = *= /= %= += -=
		
		// ���������
		// ��������ڴ� 4Ģ�����ڿ� ������ �����ڷ� �̷���� �ִ�.
		int n1 = 20;
		int n2 = 7;

		System.out.println("n1 = "+ n1);
		System.out.println("n2 = "+ n2  + "\n");
		
		int n3 = n1 + n2;
		System.out.println("n1 + n2 = "+ n3);

		n3 = n1 * n2;
		System.out.println("n1 * n2 = "+ n3);

		n3 = n1 / n2;
		System.out.println("n1 / n2 = "+ n3);

		n3 = n1 % n2;
		System.out.println("n1 % n2 = "+ n3 + "\n");
		
		// ���Կ�����
		// Ư�� ���� ������ �����Ͽ� ����ų �� ����ϴ� ������
		int n4 = 0;
		n4 += n1;
		System.out.println("n4 = "+ n4);
		
		n4 *= n1;
		System.out.println("n4 = "+ n4);
		
		n4 /= n1;
		System.out.println("n4 = "+ n4);
		
		n4 %= n1;
		System.out.println("n4 = "+ n4);
	}
}
