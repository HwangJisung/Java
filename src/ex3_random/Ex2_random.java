package ex3_random;

import java.util.Random;

public class Ex2_random {
	public static void main(String[] args) {
		// 1 ~ 10 ������ ������ �߻��Ͽ� �������� ���
		// ��, 1�̳� 10�� �߻����� ��쿡�� "�߸��Ǿ����ϴ�"��� ������ ���

		int rnd = new Random().nextInt(9) + 1;

		if (rnd == 1 || rnd == 10)
			System.out.println(rnd + "�� �߸��Ǿ����ϴ�.");
		else {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", rnd, i, rnd * i);
			}
		}
	}
}
