package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		// continue�� : �ݺ��� ������ Ư�� ������ ������ �ǳʶٰ��� �� �� ����ϴ� Ű����
		
		for( int i = 1; i <=3; i++) {
			
			if( i == 2) {
				// for�� �ȿ��� continue�� ���Ǹ� ����� for���� ���������� �ǳʶڴ�.
				continue;
				// break���� ���������� continue�� �ٷ� �Ʒ����� � �ڵ嵵 ������ �� ����.
			}
			System.out.println( i );
		}
		
		System.out.println("===================");
		
		for(int i=0; i<3;) {
			i++;			
			if( i == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
}
