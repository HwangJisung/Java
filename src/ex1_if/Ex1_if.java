package ex1_if;

public class Ex1_if {
	public static void main(String[] args) {
		// ��� : ���α׷��� �帧�� �����ϴ� ����
		// �б⹮�� �ݺ������� ������
		// �б⹮ : if , switch
		// �ݺ��� : for , while
		
		// �ܼ� if��
		// if(���ǽ�){
		// ���ǽ��� ���϶� ����Ǵ� ����
		//}
		
		int n = 51;
		String str = "Hi!";
		
		if(n == 50)
		{
			str = "n�� 50�Դϴ�.";
		}
		
		if(n != 50)
		{
			str = "n�� 50�� �ƴմϴ�.";
		}

		System.out.println("str :" + str);
		
		char gender = '��';
		
		if(gender == '��') {
			System.out.println("���� �����Դϴ�.");
		} else
			System.out.println("���� �����Դϴ�.");
	}
}
