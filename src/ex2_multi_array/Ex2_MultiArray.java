package ex2_multi_array;

public class Ex2_MultiArray {
	public static void main(String[] args) {
		String[][] score = { {"90","85"},{"70","99","68"} };
		
		// 2���� �迭 score�� ��� ��� ������ ���
		for(int i = 0; i < score.length; i++) {
			for(int j=0; j < score[i].length; j++)
			{
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}
}
