package ex1_if;

public class Ex3_else_if {
	public static void main(String[] args) {
		// ����if��( else-if ) : �������� ���� �񱳰� �ʿ��� �� ����ϴ� ���
		int num = 75;
		String str = "";
		
		if(num >= 90) {
			str = "�� ������ ��";
		} else if (num >= 80) {
			str = "�� ������ ��";
		} else if (num >= 70) {
			str = "�� ������ ��";
		} else if (num >= 60) {
			str = "�� ������ ��";
		} else {
			// if�� else if�� ��� ������ �����϶� �ݵ�� ����Ǵ� ����
			str = "�� ������ ��";
		}
		
		System.out.println( str );
		
	}
}
