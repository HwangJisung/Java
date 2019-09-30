package ex1_array;

import java.util.Random;

public class Ex4_lotto {
	public static void main(String[] args) {
		// 1~45사이의 난수를 발생시켜 로또번호 생성기 만들기!!
		int[] lotto = new int[6];
		int rndInt = 0;
		Random rnd = new Random();
		
		rndInt = rnd.nextInt(45)+1;
		for(int i=0; i<lotto.length; i++) {
			
		}
	}
}
