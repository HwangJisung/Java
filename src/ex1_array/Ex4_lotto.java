package ex1_array;

import java.util.Random;

public class Ex4_lotto {
	public static void main(String[] args) {
		// 1~45������ ������ �߻����� �ζǹ�ȣ ������ �����!!
		int[] lotto = new int[6];
		
		outer : for(int i=0; i<lotto.length; ) {
			lotto[i] = new Random().nextInt(45)+1;
			
			// �ߺ��� üũ
			for(int j=0; j< i; j++) {
				if(lotto[i] == lotto[j])
					continue outer;
			}
			System.out.print(lotto[i]+" ");
			i++;
		}
	}
}
