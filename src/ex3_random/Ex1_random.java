package ex3_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {
		// ���� �����
		// 3 ~ 7 ������ ������ �����
		// new Random().nextInt( �߻���ų ������ ����) + ���ۼ�;
		// new Random().nextInt( ���� - ���� �� + 1) + ���ۼ�;
		int rnd = new Random().nextInt(5) + 3;
		
		System.out.println(rnd);
		
		// 253 ~ 2716 ������ ������ �����
		int startInt = 253;
		int endInt = 2716;
		int rnd2 = new Random().nextInt(endInt - startInt + 1) + startInt;
		
		System.out.println(rnd2);
	}
}
