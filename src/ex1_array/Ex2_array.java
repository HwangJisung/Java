package ex1_array;

public class Ex2_array {
	public static void main(String[] args) {
		String[] sArr = new String[4];
		
		sArr[0]="j";
		sArr[1]="a";
		sArr[2]="v";
		sArr[3]="a";
		
		// �迭 sArr�� ��� ��� ������ ȭ�鿡 ���
		for(int i=0; i<sArr.length; i++)
		{
			System.out.printf("%s",sArr[i]);
		}
	}
}
