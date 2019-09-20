package ex3_random;

import java.util.Random;

public class Ex2_random {
	public static void main(String[] args) {
		// 1 ~ 10 사이의 난수를 발생하여 구구단을 출력
		// 단, 1이나 10이 발생됐을 경우에는 "잘못되었습니다"라는 문장을 출력

		int rnd = new Random().nextInt(9) + 1;

		if (rnd == 1 || rnd == 10)
			System.out.println(rnd + "은 잘못되었습니다.");
		else {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", rnd, i, rnd * i);
			}
		}
	}
}
