package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		// if-else�� : �ΰ��� ������ ����� ��� Ŀ���ϴ� if��
		// if( ���ǽ� ){
		//	���ǽ��� ���϶� ����Ǵ� ����
		// } else {
		//	���ǽ��� �����϶� ����Ǵ� ����
		// }
		
		int num = 49;
		String str = "";
		
		if( num++ > 50) {
			str = "num�� 50 �̻��� �� �Դϴ�.";
		} else {
			str = "num�� 50 �̸��� �� �Դϴ�.";
		}
		
		System.out.println("��� : " + str);
		
		// age��� ������ ���̸� �����ϰ� 
		// 30�� �̻��̸� �հ�. �׷��� ������ ���հ��� ���
		int age = 39;
		
		if(age >= 30) {
			str = "�հ�!";
		} else {
			str = "���հ�!";
		}
		
		System.out.println("��� : " + str);
		
		// ���� �ڵ带 ���׿����ڷ� ����
		str = age >= 30 ? "�հ�" : "���հ�";
		
		System.out.println("��� : " + str);
	}
}
