package ex3_label;

public class Ex1_label_break {
	public static void main(String[] args) {
		// label break, label continue : 
		// ���� ����� �ݺ����� ���������ų� �ǳʶٴ� �Ϲ� break, continue�� �޸� 
		// Ư�� �ݺ����� �̸��� �����Ͽ� �ѹ��� �ΰ� �̻��� �ݺ����� ������ �� �ֵ��� �ϴ� ���
		out : for(int i=1; i <=3; i++) {
			for(int j=1; j <=10; j++) {
				if( j % 3 == 0) {
					break out; // out for ���� break�� �ɷ��� ��������
				}
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
