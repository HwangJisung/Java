package ex1_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
		// ���� for�� : for�� �ȿ� for���� �ִ� ���

		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		for (int i = 1; i <= 4; i++) { // y��
			for (int j = 1; j <= 4; j++) { // x��
				System.out.print(j + " ");
			} // inner
			System.out.println();
		} // outer

		System.out.println("---------------");

		// 1 2 3 4
		// 5 6 7 8
		int k = 0;

		for (int i = 1; i <= 2; i++) { // y��
			for (int j = 1; j <= 4; j++) { // x��
				k = k + 1;
				System.out.print(k + " ");
			} // inner
			System.out.println();
		} // outer

		System.out.println("---------------");
		
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		for (int i = 1; i <= 5; i++) { // y��
			for (int j = 1; j <= i; j++) { // x��
				System.out.print("* ");
			} // inner
			System.out.println();
		} // outer	
		
	}
}
