package ex1_single_for;

public class Ex1_single_for {
	public static void main(String[] args) {
		// for�� : Ư�� ����� ���ϴ� ��ŭ �ݺ������� ó���ϰ��� �� �� ���
		// for( �ʱ��; ���ǽ�; ������ ){
		//	���ǽ��� ���� �� ����Ǵ� ����
		// }
		
		for(int i=0; i<3; i++)
		{
			System.out.println("i : " + i);
		}
		
		System.out.println("============================");
		
		// 10���� �����ؼ� 1���� �����ϴ� for���� �ۼ��ϼ���
		for(int j=10; j>0; j--) {
			System.out.println("j : " + j);
		}

		System.out.println("============================");
		
		// 1���� 100���� �ݺ��ϴ� for������ 3�� ����� ȭ�鿡 ���
		for(int k=1; k<100; k++) {
			if(k % 3 == 0)
			{
				System.out.println("k : " + k);
			}
		}

		System.out.println("============================");
		
		// 1���� 100���� �ݺ��ϴ� for������ 3�� ����� ȭ�鿡 ���
		for(int a=3; a<100; a=a+3) {
			System.out.println("a : " + a);
		}
	}
}
