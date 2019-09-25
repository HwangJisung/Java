package ex2_continue;

import java.util.Random;

public class Ex3_continue {
	public static void main(String[] args) {
		int n = 0;
		
		while(n<=10) {
			n++;
			
			if( n % 3 == 0) {
				continue;
			}
			System.out.println(n);
		}
		
		System.out.println("=============");
		
		// 무한반복하는 while문을 만들고, 발생된 난수가 3일 경우에 while문을 빠져나가도록 하자.
		int r = 0;
		
		while( true )
		{
			 r = new Random().nextInt(5) + 1;
			if( r != 3) {
				System.out.println(r);
				continue;
			} else {
				System.out.println(r + "이다! 끝!!!!!!!!!!!!!!!!!!");
				break;
			}
		}
	}
}
