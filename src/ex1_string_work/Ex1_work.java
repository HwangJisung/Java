package ex1_string_work;

public class Ex1_work {
	public static void main(String[] args) {
		
		//�Ʒ� input�� �ҹ��� a�� � ���ԵǾ� �ִ��� ȭ�鿡 ���
		String input = "asfasdfjkasdjf;kjasd;kfj;askdjf;askjdf;lkaj";
		int cnt = 0;
		
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i) == 'a')
				cnt++;
		}
		System.out.println("a�� ���� : " + cnt);
	}
}
