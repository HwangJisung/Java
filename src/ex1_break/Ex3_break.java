package ex1_break;

public class Ex3_break {
	public static void main(String[] args) {
		for(int i = 0; i < 2; i++) {
			for(int j = 1; j <=10; j++) {
				if (j % 2 ==0) {
					break;
				}
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
