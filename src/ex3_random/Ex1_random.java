package ex3_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {
		// 난수 만들기
		// 3 ~ 7 사이의 난수를 만들기
		// new Random().nextInt( 발생시킬 난수의 범위) + 시작수;
		// new Random().nextInt( 끝수 - 시작 수 + 1) + 시작수;
		int rnd = new Random().nextInt(5) + 3;
		
		System.out.println(rnd);
		
		// 253 ~ 2716 사이의 난수를 만들기
		int startInt = 253;
		int endInt = 2716;
		int rnd2 = new Random().nextInt(endInt - startInt + 1) + startInt;
		
		System.out.println(rnd2);
	}
}
