package ex2_value_type;

public class Ex1_value {
	public static void main(String[] args) {
		// �⺻�ڷ���(valueType)
		// ���� : boolean
		// ������ : char  
		// ������ : byte(1), short(2), int(4), long(8) 
        // �Ǽ��� : float(4), double(8)
		
		// ���� : Ư������ �����Ͽ� ����ų�� ����ϴ� ����
		
		// 1. ���� �̸��� ������ ������ ���� �� ����.
		// 2. �������� ���ڷ� ������ �� ����.
		// 3. _�� �����ϰ� Ư�����ڸ� ����� �� ����.
		// 4. �ѱ۷� �������� �ۼ����� �ʴ´�.
		
		// ���� : true , false ��, ���� ������ �ΰ��� �� ���� ������ �� �ִ� �ڷ���
		boolean bool = false;
		
		if(bool) System.out.println("bool : " + bool);
		else System.out.println("bool : " + bool);
		
		
		// ������ : Ȭ����ǥ �ȿ� �� �ѱ��ڸ� �����ϴ� �ڷ���
		char ch = 'A';		
		System.out.println("char : " + ch);
		
		// ������
		byte by = 127;
		System.out.println("byte : " + by);
		
		short s = 32767;
		System.out.println("short : " + s);
		
		long l = 2200000000L;
		System.out.println("long : " + l);
		
		int a = 2100000000; 
		int b = 200;
		
		int c = a+b;
		System.out.println("int : " + c);
		
		// �Ǽ���
		float f = 3.14f;
		System.out.println("float :" + f);
		
		double d = 3.14195;
		System.out.println("double :" + d);					
	}
}
