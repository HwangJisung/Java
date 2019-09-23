package ex1_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
		// 다중 for문 : for문 안에 for문이 있는 경우

		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		for (int i = 1; i <= 4; i++) { // y열
			for (int j = 1; j <= 4; j++) { // x열
				System.out.print(j + " ");
			} // inner
			System.out.println();
		} // outer

		System.out.println("---------------");

		// 1 2 3 4
		// 5 6 7 8
		int k = 0;

		for (int i = 1; i <= 2; i++) { // y열
			for (int j = 1; j <= 4; j++) { // x열
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
		for (int i = 1; i <= 5; i++) { // y열
			for (int j = 1; j <= i; j++) { // x열
				System.out.print("* ");
			} // inner
			System.out.println();
		} // outer	
		
	}
}
