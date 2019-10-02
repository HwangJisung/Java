package ex1_array;

import java.util.Random;

public class Ex4_lotto {
	public static void main(String[] args) {
		// 1~45사이의 난수를 발생시켜 로또번호 생성기 만들기!!
		int[] lotto = new int[6];
		
		outer : for(int i=0; i<lotto.length; ) {
			lotto[i] = new Random().nextInt(45)+1;
			
			// 중복값 체크
			for(int j=0; j< i; j++) {
				if(lotto[i] == lotto[j])
					continue outer;
			}
			System.out.print(lotto[i]+" ");
			i++;
		}
	}
}
