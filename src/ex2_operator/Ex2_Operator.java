package ex2_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		
		// �� ������
		// ������ ����� ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������
		int n1 = 10;
		int n2 = 20;
		
		boolean result = false;
		boolean result2 = false;
		
		result = n1 == n2;
		result2 = n1 > n2;
				
		if(result)
		{
			System.out.println("����!");
		} else
		{
			System.out.println("Ʋ����!");
		}

		if(result2)
		{
			System.out.println("n1�� ũ��!");
		} else
		{
			System.out.println("n2�� ũ��!");
		}
		
		// �� ������
		// �� �����ڸ� ���� ������ �� �� �̻� �ʿ��� �� ����Ѵ�.
		int myAge = 20;
		int limit = 25;
		
		boolean result3 = false;
		
		result3 = limit - myAge >= 5 && myAge >20;
		
		if(!result3)
		{
			System.out.println("result3: " + result3);
		}
		
		int i1 = 10;
		int i2 = 20;
		
		boolean  result4 = false;
		
		result4 = (i1 += 10) > 20 || i2 - 10 >= 10;
		
		if(result4)
		{
			System.out.println("result4 :" + result4);
		}
		
		// not ������(!) : true�� false��, false�� true�� ����
		System.out.println("!result4 :" + !result4);
	}
}
